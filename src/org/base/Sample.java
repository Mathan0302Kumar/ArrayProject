package org.base;

public class Sample {
	int a = 5;
	int b = 188;
	int c = a + b;

	private void savings(int a, int b) {
		int c = 0;
		c = a - b;
		System.out.println(c);
		c = a + b;
		System.out.println(c);

	}

	public static void main(String[] args) {

		Sample mn = new Sample();
		System.out.println(mn.c);
		mn.savings(55, 89);
		System.out.println(mn.c);
		
		Sample mk = new Sample();
		System.out.println(mk.a);
		System.out.println(mk.b);
		System.out.println(mk.c);

	}

}
