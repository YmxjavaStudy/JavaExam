package com.yanmingxing.javaexam;

public class ThreadTest {
	
	    public static void main(String[] args) {
	 
	         MyRunnable myRunnable = new MyRunnable();
	         Thread thread = new Thread(myRunnable);
	         
	         for (int i = 0; i < 100; i++) {
	             System.out.println(Thread.currentThread().getName() + " " + i);
	             if (i == 30) {
	                 try{thread.start();
	                 
	             thread.setDaemon(true);
	             }catch (Exception e) {
					e.printStackTrace();
				}
	            	 
	             }
	             
	             if(i == 40){
                 myRunnable.stopThread();
	             }
	         }
	     }
	 }
	 
	 class MyRunnable implements Runnable {
	 
	     private boolean stop=false;
	 
	     @Override
	     public void run() {
	         for (int i = 0; i < 100 && !stop; i++) {
	             System.out.println(Thread.currentThread().getName() + " " + i);
	         }
	     }
	 
	     public void stopThread() {
	         this.stop = true;
	   }
	 
	 }
