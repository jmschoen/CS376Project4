import java.util.Stack;

public class LRU extends ReplacementAlgorithm {

    private Stack referenceStack = new Stack();
    private int leastRecentPageNumber;

    public LRU(int pageFrameCount) {
        super(pageFrameCount);
    }

    @Override
    public void insert(int pageNumber) {

        int buffer = this.pageFrameCount;

        if(referenceStack.contains(pageNumber)){
            referenceStack.remove(referenceStack.indexOf(pageNumber));
        }
        referenceStack.add(pageNumber);

    }

    private void getLeastRecentPageNumber(){
        leastRecentPageNumber = (int)referenceStack.get(0);
    }
}
