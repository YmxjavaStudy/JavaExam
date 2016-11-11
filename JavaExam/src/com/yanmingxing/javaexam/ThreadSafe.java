package com.yanmingxing.javaexam;

public class ThreadSafe implements Runnable {
	int num = 10;

public void run() {
	while (true) {
		synchronized ("") {

			if (num > 0) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("tickets" + num--);
			}
		}
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ThreadSafe t = new ThreadSafe();
	Thread tA = new Thread(t);
	Thread tB = new Thread(t);
	Thread tC = new Thread(t);
	Thread tD = new Thread(t);
	Thread tE = new Thread(t);
	Thread tF = new Thread(t);
		Thread tG = new Thread(t);
		tA.start();
		tB.start();
		tC.start();
		tD.start();
		tE.start();
		tF.start();
		tG.start();

	}

}
