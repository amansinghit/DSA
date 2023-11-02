package queue;

public class Queue {
	private int rear;
	private int front;
	private int size;
	private int[] arr;

	Queue(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (rear == (size - 1))
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	public void enque(int element) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		} else {
			if (isEmpty()) {
				this.front++;
				this.rear++;
				arr[this.rear++] = element;
			}
			else
			arr[this.rear++] = element;

		}
	}

	public void deque() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return ;
		} else {
           front++;
       
		}
	}
	public void display() {
		if(front==rear) {
			System.out.println("Queue is empty");
			return;
		}
			
		for(int i=front;i<rear;i++) {
			System.out.print(arr[i]+" ");
	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue q1 = new Queue(10);
		q1.enque(12);
		q1.enque(13);
		//q1. display();
		q1.deque();
	    q1.deque();
	    q1.deque();
	    q1. display();
		
	}

}
