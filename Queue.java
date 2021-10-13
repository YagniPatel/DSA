import java.util.ArrayList;
import java.util.Scanner;

class QueueDemo {
	
	int size;
	int f, r;
	
	ArrayList<Integer> lst = new ArrayList<Integer>(size);
	
	QueueDemo(int sz) {
		f = r = -1;
		size = sz;
	}
	
	void insertion(int n) {
		if(r>=size-1) 
			System.out.println("queue overflow");
		else {
			lst.add(n);
			r++;
			if(f==-1)
				f++;
		}		
	}
	
	void deletion() {
		if(f==-1 || f>r) 
			System.out.println("queue underflow");
		else {
			lst.remove(0);
			f++;
		}
	}
	
	void search(int p) {
		if(r<p || f>p) 
			System.out.println("error!!!!");
		else
			System.out.println("element at " + p + " is..... " + lst.get(p));
	}
	
	void change(int p, int e) {
		if(r<p || f>p) 
			System.out.println("error!!!!");
		else {
			lst.set(p, e);
			System.out.println("element at index " + p + " is..... " + lst.get(p));
		}
	}
	
	void display() {
		if(r==-1 || f>r) 
			System.out.println("empty queue");
		else {
			for(int i:lst)
				System.out.print(i + "	");	
			System.out.println();	
		}
	}
}

public class Queue {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("enter size of queue... ");
		int sz = ob.nextInt();
				
		QueueDemo q = new QueueDemo(sz);
		int i=-1;
		
		System.out.println("0.exit\n1.insertion\n2.deletion\n3.search\n4.change\n5.display");

		while(i!=0) {
			System.out.println("enter your choice ");
			i = ob.nextInt();
			
			switch(i) {
			case 0:
				break;
				
			case 1:
				System.out.println("enter element... ");
				int e = ob.nextInt();
				q.insertion(e);
				break;
				
			case 2:
				q.deletion();
				break;
				
			case 3:
				System.out.println("enter place... ");
				int p = ob.nextInt();
				q.search(p);
				break;
				
			case 4:
				System.out.println("enter place & new value... ");
				int in = ob.nextInt();
				int a = ob.nextInt();
				q.change(in,a);
				break;
				
			case 5:
				q.display();
				break;
				
			default:
				System.out.println("wrong choice!!");
			}
			
		}

	}

}
