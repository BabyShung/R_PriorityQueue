import HeapPriorityQueue.HeapPriorityQueue;
import Interfaces.Comparator;
import Interfaces.PriorityQueue;
import UnsortedArrayPriorityQueue.UnsortedArrayPriorityQueue;
import Interfaces.Entry;

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

		PriorityQueue<Integer, String> hpq = new HeapPriorityQueue<Integer, String>(
				new Comparator<Entry<Integer, String>>() {

					@Override
					public int compare(Entry<Integer, String> a,
							Entry<Integer, String> b) {
						if (a.getKey() > b.getKey())
							return 1;
						else if (a.getKey() < b.getKey())
							return -1;
						else
							return 0;
					}

				});

		// since the heap is max heap, it will remove the largest one first
		hpq.insert(1, "Hello");
		hpq.insert(2, "Goodbye");
		hpq.insert(0, "Bonjour");
		System.out.println(hpq.removeMin().getKey());
		System.out.println(hpq.removeMin().getKey());
		System.out.println(hpq.removeMin().getKey());

	}

}
