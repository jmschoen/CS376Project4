/**
 * Test harness for LRU page replacement algorithms
 *
 * Usage:
 *	java [-Ddebug] Test <reference string size> <number of page frames>
 */

public class Test
{
	public static void main(String[] args) {
		PageGenerator ref = new PageGenerator(new Integer(args[0]).intValue());

		int[] referenceString = ref.getReferenceString();

		/** Use either the LRU algorithm */
		ReplacementAlgorithm lru = new LRU(new Integer(args[1]).intValue());

		// output a message when inserting a page
		for (int i = 0; i < referenceString.length; i++) {
			//System.out.println("inserting " + referenceString[i]);
			lru.insert(referenceString[i]);
		}


		// report the total number of page faults
		System.out.println("LRU faults = " + lru.getPageFaultCount());

	}
}
