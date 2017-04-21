import java.util.Stack;

public class LRU extends ReplacementAlgorithm {

    private Stack referenceStack = new Stack();

    public LRU(int pageFrameCount) {
        super(pageFrameCount);
    }

    @Override
    public void insert(int pageNumber) {
        if(referenceStack.contains(pageNumber)){
            referenceStack.remove(referenceStack.indexOf(pageNumber));
        } else {
            if(referenceStack.size() == this.pageFrameCount){
                referenceStack.remove(referenceStack.indexOf(getLeastRecentPageNumber()));
            }
            this.pageFaultCount++;
        }
        referenceStack.add(pageNumber);
    }

    private int getLeastRecentPageNumber(){
        return (int)referenceStack.firstElement();
    }
}
