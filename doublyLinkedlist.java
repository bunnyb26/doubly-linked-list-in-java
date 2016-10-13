
public class doublyLinkedlist {
	private Node header;
	private Node lastnode;
	private int size;
	
	public doublyLinkedlist(){
		header =new Node(null);  //creating dummy node which has reference to first node
		lastnode=header;
	}
	
	
	public void prepand(Integer data){
		Node n= new Node(data);
		if(size==0) //no element in our linked list 
		{header.next=n;
		lastnode=n;
		n.prev=header;
		size++;
		}else{
			n.next=header.next;
			n.prev=header;
			header.next=n;
			n.next.prev=n;
			size++;
		}
	}
	
	public void append(Integer data){
		Node n=new Node(data);
		if(size==0) //no element in our linked list 
		{header.next=n;
		lastnode=n;
		n.prev=header;
		size++;
		}else{
			lastnode.next=n;
			n.prev=lastnode;
			lastnode=n;
			size++;
		}
	 }
	
	public void removefirst(){
		if(size!=0){
		header.next.next.prev=header; //gives us second node in the linked list
	    header.next=header.next.next;
		size--;
		}
	}
	
	public void removelast(){
		if(size==1){
			header.next=null;
			lastnode=header; //reference to dummy node
			size--;
		}
		else if(size!=0){
			lastnode=lastnode.prev;
			lastnode.next=null;
			size--;
		}
	
	}
	public void insertAt(int index,Integer data){
		if(index<=0 || index>size){ //important hai
			return;
		}
		else if(index==1)
			prepand(data);//if user enters the index of first node
		else if (index==size)
			append(data);//if user enters the index of last node
		else{
			Node n=new Node(data);
			Node x=header.next; //reference to first node;
			int count=1;
		    while(count!=index){
		    	x=x.next;
		    	count++;
		    }
		  n.next=x;
		  n.prev=x.prev;
		  x.prev.next=n;
		   x.prev=n;
		    size++;
		}
	}
	
	
	
	public void removeAt(int index){
		if(index<=0 || index>size){ //important hai
			return;
		}
		else if(index==1)
			removefirst();
		else if (index==size)
			removelast();
		else{
			Node n=header.next;
			int count=1;
			while(count!=index){
				n=n.next;
				count++;
			}
			n.prev.next=n.next;
			n.next.prev=n.prev;
			
			size--;
		}
	}
	
	
	
	public int getsize(){
		return size;
	}
	
	public String toString(){
		Node n=header.next;
		String temp="";
		while(n!=null){
		temp=temp+n.data+" ";
			n=n.next;
		}
		return temp;
	}
	
	
	
	public String printreverse(){
		Node n=lastnode;
		String temp="";
		int tempsize=size;
		while(tempsize!=0){
		temp=temp+n.data+" ";
			n=n.prev;
			tempsize--;
		}
		return temp;
	}
	
	
}
