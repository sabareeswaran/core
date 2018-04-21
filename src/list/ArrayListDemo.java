package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("World");
		System.out.println(al);
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Hello");
		ll.add("LinkedList");
		ll.addFirst("Hi");
		ll.add(3,"Bye");
		System.out.println(ll);
	}
}
