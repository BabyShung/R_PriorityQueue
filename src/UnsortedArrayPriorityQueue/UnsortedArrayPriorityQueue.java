package UnsortedArrayPriorityQueue;

import java.util.ArrayList;

import java.util.NoSuchElementException;

import Interfaces.Comparator;
import Interfaces.Entry;
import Interfaces.PriorityQueue;

public class UnsortedArrayPriorityQueue<K, V> implements PriorityQueue<K, V> {
	
	private ArrayList<Entry<K, V>> queue = new ArrayList<>();
	private Comparator<K> comparator;

	public UnsortedArrayPriorityQueue(Comparator<K> comp) {
		comparator = comp;
	}

	@Override
	public Entry<K, V> min() {	//O(n)
		checkEmpty();
		return queue.get(getMinIndex());
	}

	@Override
	public Entry<K, V> removeMin() {	//O(n)
		checkEmpty();
		return queue.remove(getMinIndex());
	}

	@Override
	public Entry<K, V> insert(K key, V value) {
		queue.add(new Pair<>(key, value));
		return queue.get(queue.size() - 1);
	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	private int getMinIndex() {
		int minIdx = 0;

		for (int i = 0; i < size(); i++) {
			if (comparator.compare(queue.get(i).getKey(), queue.get(minIdx)
					.getKey()) < 0) {
				minIdx = i;
			}
		}

		return minIdx;
	}

	private void checkEmpty() {
		if (isEmpty()) {
			throw new NoSuchElementException("Priority queue empty");
		}
	}
}
