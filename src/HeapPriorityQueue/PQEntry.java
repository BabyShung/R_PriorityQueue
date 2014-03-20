package HeapPriorityQueue;

/**
 * Similar to BSTEntry, please view
 */

import Interfaces.Entry;

public class PQEntry<K, V> implements Entry<K, V> {
	protected K key;
	protected V value;

	public PQEntry(K k, V v) {
		key = k;
		value = v;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}