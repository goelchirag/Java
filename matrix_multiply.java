package prog1;

import java.util.Scanner;

class matrix {
	int[][] a = new int[3][3];

	matrix() {
		int i, j;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				a[i][j] = 0;

	}

	void display() {
		int i, j;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				System.out.println(a[i][j]);
	}

	int index(int x, int y) {
		return a[x][y];
	}

	void insert() {
		System.out.println("Insert elements");
		int i, j;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				a[i][j] = new Scanner(System.in).nextInt();
	}

	void multiply(matrix b, matrix c) {
		int i, j, k;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				for (k = 0; k < 3; k++)

					a[i][j] += b.index(i, k) * c.index(k, j);
	}
}

public class matrix_multiply {

	public static void main(String[] args) {
		matrix b = new matrix();
		matrix c = new matrix();
		matrix a = new matrix();
		b.insert();
		c.insert();
		a.multiply(b, c);
		a.display();

	}
}
