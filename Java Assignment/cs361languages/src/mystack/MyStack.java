/**
 * 
 */
package mystack;

/**
 * @author Kevin Liu
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		if (this.theStack != null) {
			T val = this.theStack.val;
			this.theStack = this.theStack.next;
			return val;
		}
		return null;
	}

	public void push(T v) {
		if (this.theStack == null) {
			this.theStack = new MyNode<T>(v, null);
			return;
		}

		MyNode<T> node = new MyNode<T>(v, theStack);
		this.theStack = node;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intStack = new MyStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.pop();
		intStack.push(5);

		//  To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> personStack = new MyStack<>();
		personStack.push(new Person("Kevin", "Liu"));
		personStack.push(new Person("Scharff", "Christelle"));
	}

}
