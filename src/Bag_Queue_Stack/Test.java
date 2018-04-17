package Bag_Queue_Stack;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		System.out.println("--------stack--------");
		Stack<String> ss =new Stack<>();
		ss.push("a");
		ss.push("c");
		ss.push("b");
		ss.push("d");
		ss.pop();
		System.out.println(ss.isEmpty());
		System.out.println(ss.size());
		Iterator<String> iterator =ss.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		
		System.out.println("--------queue--------");
		Queue<String> qq =new Queue<>();
		qq.enqueue("a");
		qq.enqueue("b");
		qq.enqueue("c");
		qq.enqueue("d");
		qq.dequeue();
		System.out.println(qq.isEmpty());
		System.out.println(qq.size());
		Iterator<String> iterator2 =qq.iterator();
		while (iterator2.hasNext()) {
			String s = (String) iterator2.next();
			System.out.println(s);
		}
		
		System.out.println("--------bag--------");
		Bag<String> bb =new Bag<>();
		bb.add("a");
		bb.add("b");
		bb.add("c");
		bb.add("d");
		System.out.println(bb.isEmpty());
		System.out.println(bb.size());
		Iterator<String> iterator3 =bb.iterator();
		while (iterator3.hasNext()) {
			String s = (String) iterator3.next();
			System.out.println(s);
		}
	}
}
