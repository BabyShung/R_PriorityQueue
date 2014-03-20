package HeapPriorityQueue;

import Heap.ArrayHeap;
import Interfaces.BTPosition;
import Interfaces.Comparator;
import Interfaces.Entry;
import Interfaces.PriorityQueue;

/**
 * Priority Queue, just reuse heap
 * 
 * 
 * @author haozheng
 * 
 */

public class HeapPriorityQueue<K, V> implements PriorityQueue<K, V> {

	private ArrayHeap<Entry<K, V>> ah;

	public HeapPriorityQueue(Comparator<Entry<K, V>> comp) {
		ah = new ArrayHeap<>(comp);
	}

	@Override
	public Entry<K, V> min() {

		return ah.getRoot().element();
	}

	@Override
	public Entry<K, V> removeMin() {// O(1) time since using heap
		return ah.remove().element();
	}

	@Override
	public Entry<K, V> insert(K key, V value) {// O(logn) time
		Entry<K, V> en = new PQEntry<>(key, value);
		ah.insert(en);
		return en;
	}

	@Override
	public int size() {
		return ah.size();
	}

	@Override
	public boolean isEmpty() {
		int size = ah.size();
		return size == 0 ? true : false;
	}

}
