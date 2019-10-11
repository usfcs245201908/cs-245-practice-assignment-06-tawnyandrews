import java.util.*;

public class ArrayStack<T> implements Stack<T>{
	 int top ;//= -1;
	 Object[]a;// = new T[100];

	public ArrayStack() {
		a = new Object[10];
		top = -1;
	}
	public boolean empty() {
		// if(top==-1)
		// 	return true; 
		// return false;
		return top == -1;
	}

	public Object pop() {
		// if(empty())
		// 	throw new Exception("Stack is empty!");
		return a[top--];
	}

	public void push(Object item){
		if(a.length-1 == top)
			grow_array();
		a[++top]=item;
	}

	public Object peek(){
		// if(empty())
		// 	throw new Exception("Stack is empty!");
		return a[top];
	}

	void grow_array() {
		Object[]new_a=Arrays.copyOfRange(a,0,a.length*2);
		a = new_a;


	}
}