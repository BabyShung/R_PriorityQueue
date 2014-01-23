package Interfaces;

public interface PriorityQueue<K, V> {
	// Return (but do not remove) the entry with the minimum key
	Entry<K, V> min();

	// Remove *and* return the entry with the minimum key
	Entry<K, V> removeMin();

	// Insert the given key-value pair into the priority queue, and return
	// the newly-created entry
	Entry<K, V> insert(K key, V value);
 
	int size();
 
	boolean isEmpty();
}