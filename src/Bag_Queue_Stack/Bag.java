package Bag_Queue_Stack;

import java.util.Iterator;

public class Bag<Item> {
	private int N;
	private Node first;
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
	public void add(Item item) {
		Node oldNode =first;
		first = new Node();
		first.item =item;
		first.next =oldNode;
		N++;
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
