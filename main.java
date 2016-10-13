
public class main {

	public static void main(String[] args) {
		doublyLinkedlist list=new doublyLinkedlist();
		list.prepand(1);
		list.prepand(2);
		list.prepand(3);
		list.prepand(4);
		System.out.println(list);
		
		
		list.append(5);
		list.append(6);
		list.append(7);
		System.out.println(list);
		
		list.removefirst();
		System.out.println(list);
		
		list.removelast();
		System.out.println(list);
		
		list.insertAt(1, 50);
		list.insertAt(3, 100);
		System.out.println(list);
		
		
		list.removeAt(2);
		System.out.println(list);
		
		
		System.out.println(list.printreverse());
		
	}

}
