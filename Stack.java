import java.util.ArrayList;
import java.util.Scanner;

class StackDemo {
	
	int size;
	int t;
	ArrayList<Integer> lst = new ArrayList<Integer>(size);
	
	StackDemo(int sz) {
		t = -1;
		size = sz;
	}
	
	void push(int n) {
		if(t>=size-1) 
			System.out.println("stack overflow");
		else {
			lst.add(n);
			t++;
		}		
	}
	
	void pop() {
		if(t==-1) 
			System.out.println("stack underflow");
		else {
			lst.remove(t);
			t--;
		}
	}
	
	void peep(int p) {
		if(t<p) 
			System.out.println("error!!!!");
		else
			System.out.println("element at " + p + " is..... " + lst.get(p));
	}
	
	void change(int p, int e) {
		if(t<p) 
			System.out.println("error!!!!");
		else {
			lst.set(p, e);
			System.out.println("element at index " + p + " is..... " + lst.get(p));
		}
	}
	
	void display() {
		if(t==-1) 
			System.out.println("empty stack");
		else {
			for(int i:lst)
				System.out.print(i + "	");	
			System.out.println();	
		}
	}
}

public class Stack {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("enter size of stack... ");
		int sz = ob.nextInt();
				
		StackDemo s = new StackDemo(sz);
		int i=-1;
		
		System.out.println("0.exit\n1.push\n2.pop\n3.peep\n4.change\n5.display");

		while(i!=0) {
			System.out.println("enter your choice ");
			i = ob.nextInt();
			
			switch(i) {
			case 0:
				break;
				
			case 1:
				System.out.println("enter element... ");
				int e = ob.nextInt();
				s.push(e);
				break;
				
			case 2:
				s.pop();
				break;
				
			case 3:
				System.out.println("enter place... ");
				int p = ob.nextInt();
				s.peep(p);
				break;
				
			case 4:
				System.out.println("enter place & new value... ");
				int in = ob.nextInt();
				int a = ob.nextInt();
				s.change(in,a);
				break;
				
			case 5:
				s.display();
				break;
				
			default:
				System.out.println("wrong choice!!");
			}
			
		}

	}

}
