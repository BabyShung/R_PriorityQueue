import Interfaces.Comparator;
import Interfaces.PriorityQueue;
import UnsortedArrayPriorityQueue.UnsortedArrayPriorityQueue;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer, String> pq = new UnsortedArrayPriorityQueue<Integer, String>(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer a, Integer b) {
						if (a < b)
							return -1;
						else if (a > b)
							return 1;
						else
							return 0;
					}
				});

		pq.insert(1, "Hello");
		pq.insert(2, "Goodbye");
		pq.insert(0, "Bonjour");
		System.out.println(pq.removeMin());
		System.out.println(pq.removeMin());
		System.out.println(pq.removeMin());
	}

}
