package examP3;

import java.util.Scanner;

class stack {
	final int SIZE = 10;
	int top, s[] = new int[SIZE];

	stack() {
		top = -1;
	}

	void push(int n) {
		if (top == (SIZE - 1))
			System.out.println("Stack is full");
		else
			s[++top] = n;
	}

	void pop() {
		if (top == -1)
			System.out.println("Stack is empty");
		else {
			System.out.println("The deleted item is " + s[top]);
			--top;
		}
	}

	void display() {
		if (top == -1)
			System.out.println("Stack is empty");
		else
			for (int i = 0; i <= top; i++)
				System.out.println(" " + s[i]);

	}
}

public class p3 {
	private static Scanner cin;

	public static void main(String[] args) {
		stack s = new stack();
		int ch = 0;
		cin = new Scanner(System.in);
		while (ch != 4) {
			System.out.println("Enter your choice \n 1.push \n 2.pop\n 3.display\n 4.exit");
			ch = cin.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter an element");
				s.push(cin.nextInt());
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			default:
				System.out.println("Thanks");
				break;
			}
		}
	}

}
