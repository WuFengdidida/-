package Bag_Queue_Stack;

import java.util.Iterator;

public class Queue<Item> {
	private int N;
	private Node first;
	private Node last;
	public class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return N==0;
	}
	public int size() {
		return N;
	}
	public void enqueue(Item item) {
		Node oldNode =last;
		last = new Node();
		last.item =item;
		if (N==0) {	
			first =last;
		}
		else {		
			oldNode.next =last;
		}
		N++;
	}
	public Item dequeue() {
		Item item =first.item;
		first =first.next;
		N--;
		return item;
	}
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{
		private Node curr =first;
		@Override
		public boolean hasNext() {
			return curr!=null;
		}
		@Override
		public Item next() {
			Item item =curr.item;
			curr =curr.next;
			return item;
		}	
	}

}
