package edu.kis.vh.nursery.list;

/**
 * Linked list that implements methods push(), isEmpty(), isFull(), top(), pop()
 */
public class IntLinkedList {

	private Node last;
	int i;

	/**
	 *
	 * @param i value of Node
	 */
	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	/**
	 *
	 * @return false if list is empty
	 */
	public boolean isEmpty() {
		return getLast() == null;
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
		return getLast().value;
	}

	/**
	 *
	 * @return removes node fom top of the list and returns it's value
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = getLast().value;
		setLast(getLast().prev);
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
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
