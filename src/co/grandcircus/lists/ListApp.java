package co.grandcircus.lists;

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyLinkedList();
		list = new MyArrayList();
		test(list);
		//test(list);
	}
	
	private static void test(MyList list) {
		list.addAtBeginning("A");
		list.addAtBeginning("B");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.removeFromBeginning();
		list.removeFromEnd();
		
	System.out.println(list);
	System.out.println(list.size());

	}

}
