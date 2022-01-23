package edu.kis.vh.nursery.list;

/**
 * Linked list that implements methods push(), isEmpty(), isFull(), top(), pop()
 */
public class IntLinkedList {

	Node last;
	int i;

	/**
	 *
	 * @param i value of Node
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 *
	 * @return false if list is empty
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 *
	 * @return never full
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 *
	 * @return value of node at top of the list
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	/**
	 *
	 * @return removes node fom top of the list and returns it's value
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}

/**
 * node in list
 */
class Node {

	public int value;
	public Node prev, next;

	/**
	 *
	 * @param i value of the node
	 */
	public Node(int i) {
		value = i;
	}

}
