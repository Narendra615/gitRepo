package com.mt;

public class Item {
	int num;
	boolean value = false;

	synchronized void put(int num) {

		System.out.println("factorial of " + num);
		this.num = fact(num);
	
		try {
			wait();
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    // notify();
	}

	int fact(int num) {
		int sum = 1;
		for (int i = num; i > 0; i--) {
			sum = sum * i;
		}
		return sum;
	}

	synchronized void get() {

		System.out.println(" is " + num);
		
		notify();
	}
   System.out.println("hii");
   System.out.println("hii");
}
