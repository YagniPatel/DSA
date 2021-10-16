import java.util.Scanner;

class Node {
	int value;
	Node next;
	
	Node(int d) {
		value = d;
		next = null;
	}
	
	Node(int d, Node n) {
		value = d;
		next = n;
	}
}

class LinkedListDemo {
	Node head;
	
	LinkedListDemo() {
		head = null;
	}
	
	void insert(int e) {
		Node n = new Node(e, head);
		head = n;
	}
	
	void insend(int e) {
		if(head==null) 
			insert(e);
		else {
			Node itr = head;
			
			while(itr.next!=null) {
				itr = itr.next;
			}
			
			Node n = new Node(e);
			itr.next = n;
		}
	}
	
	void insat(int p, int e) {
		if(p<0 || p>=count())
			System.out.println("error!!!!");
		else if(p==0) 
			insert(e);
		else {
			Node itr = head;
			int c = 0;
			
			while(itr!=null) {
				if(c==p-1) 
					break;
				itr = itr.next;
				c++;
			}
			
			Node n = new Node(e, itr.next);
			itr.next = n;
		}
	}
	
	void delat(int p) {
		if(p<0 || p>count())
			System.out.println("error!!!!");
		else if(p==0)
			head = head.next;
		else {
			Node itr = head;
			int c=0;
			
			while(itr.next!=null) {
				if(c==p-1)
					break;
				itr = itr.next;
				c++;
			}
			
			itr.next = itr.next.next;
		}
	}
	
	void delete(int e) {
		if(head==null) 
			System.out.println("empty list");
		else {
			Node itr = head;
			if(itr.value==e) {
				System.out.println("element " + itr.value + " deleted");
				head = itr.next;
			}
			else {
				while(itr.next!=null) {
					if(itr.next.value==e)
						break;
					itr = itr.next;
				}
				
				if(itr==null)
					System.out.println("element not found");
				else {
					System.out.println("element " + itr.next.value + " deleted");
					itr.next = itr.next.next;
				}
			}
		}
	}
	
	void reverse() {
		Node c = head;
		Node p = null;
		Node n = null;
		
		while(c!=null) {
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		
		head = p;
		display();
	}
	
	void search(int e) {
		Node itr = head;
		
		int c = 0;
		
		while(itr!=null) {
			if (itr.value==e)
				break;
			c++;
			itr = itr.next;
		}
		
		if(itr==null)
			System.out.println("element not found");
		else
			System.out.println("element " + itr.value + " found at index... " + c);
	}
	
	void sort() {
		Node i = head;
		
		while(i!=null) {
			Node j = i.next;
			
			while(j!=null) {
				if(i.value>j.value) {
					int t = i.value;
					i.value = j.value;
					j.value = t;
				}
				j = j.next;
			}
			i = i.next;
		}
		
		display();
	}
	
	int count() {
		Node itr = head;
		int c=0;
		
		while(itr!=null) {
			itr = itr.next;
			c++;
		}
		
		return c;
	}
	
	void display() {
		if(head==null) 
			System.out.println("empty list");
		else {
			Node itr = head;

			while(itr!=null) {
				System.out.print(itr.value + "	");
				itr = itr.next;
			}
			System.out.println();
		}
	}
	
}

public class LinkedList {

	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		LinkedListDemo lst = new LinkedListDemo();
		int i=-1;
		
		System.out.println("0.exit\n1.insert\n2.insend\n3.insat\n4.delat\n5.delete\n6.reverse\n7.search\n8.sort\n9.count\n10.display");
		
		while(i!=0) {
			System.out.println("enter your choice ");
			i = ob.nextInt();
			
			switch(i) {
			case 0:
				break;
				
			case 1:
				System.out.println("enter element... ");
				int a = ob.nextInt();
				lst.insert(a);
				break;
				
			case 2:
				System.out.println("enter element... ");
				int b = ob.nextInt();
				lst.insend(b);
				break;
				
			case 3:
				System.out.println("enter index & element... ");
				int c = ob.nextInt();
				int d = ob.nextInt();
				lst.insat(c,d);
				break;
				
			case 4:
				System.out.println("enter index... ");
				int e = ob.nextInt();
				lst.delat(e);
				break;
				
			case 5:
				System.out.println("enter element... ");
				int f = ob.nextInt();
				lst.delete(f);
				break;
				
			case 6:
				lst.reverse();
				break;
				
			case 7:
				System.out.println("enter element... ");
				int g = ob.nextInt();
				lst.search(g);
				break;
				
			case 8:
				lst.sort();
				break;
				
			case 9:
				System.out.println("number of element is... " + lst.count());
				break;
				
			case 10:
				lst.display();
				break;
				
			default:
				System.out.println("wrong choice!!");
			}
			
		}
		
	}

}
