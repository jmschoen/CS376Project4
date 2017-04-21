public class Test
{
	public static void main(String[] args) {
		//new Integer(args[0]).intValue()
		PageGenerator ref = new PageGenerator(5);

		int[] referenceString = ref.getReferenceString();

		/** Use either the LRU algorithm */
		//new Integer(args[1]).intValue()
		ReplacementAlgorithm lru = new LRU(5);

		// output a message when inserting a page
		for (int i = 0; i < referenceString.length; i++) {
			System.out.println("inserting " + referenceString[i]);
			lru.insert(referenceString[i]);
		}


		// report the total number of page faults
		System.out.println("LRU faults = " + lru.getPageFaultCount());

	}
}
