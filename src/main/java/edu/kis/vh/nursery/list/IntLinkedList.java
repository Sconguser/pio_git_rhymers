package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	int i;

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return getLast().value;
	}

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
