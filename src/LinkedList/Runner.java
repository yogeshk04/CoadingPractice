package LinkedList;

import java.util.LinkedList;

public class Runner {
	
	public static void main(String[] args) {
		
		ListClass listClass = new ListClass();
		listClass.insert(77);
		
		LinkedList list = new LinkedList();	
		list.add(5);
		list.add(6);
		list.add(6);
		list.add("test");
		list.add(2.556);
		list.add(true);
		System.out.println(list);
	}

}
