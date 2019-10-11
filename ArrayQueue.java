import java.util.*; 

public class ArrayQueue<T> implements Queue<T> {

	Object[]a;
	int front;
	int back; 

	public ArrayQueue(){
		a = new Object[100];
		this.front = 0;
		this.back = 0;
	}

	public boolean empty(){
		   return back==front;
	}

	public Object dequeue(){
		// if(empty()){
		// 	throw new Exception("It's empty");
		// }
		return a[front++];
	}

	public void enqueue(Object item){
		if(back==a.length){
			grow_array();
		}
		a[back++] = item;
	}

	void grow_array()
	{
		Object[] new_a = Arrays.copyOf(a, a.length*2);
		a = new_a;
	}
}