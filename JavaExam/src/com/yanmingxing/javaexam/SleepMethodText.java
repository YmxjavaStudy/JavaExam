package com.yanmingxing.javaexam;

import java.awt.*;

import java.util.Random;

import javax.swing.*;

public class SleepMethodText extends JFrame{
     private Thread t;
     private static Color[] color={Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
     private static final Random rand=new Random();
     private static Color getC(){
    	 return color[rand.nextInt(color.length)];
     }
     public SleepMethodText(){
    	 t=new Thread(new Runnable() {
    		 int x=30;
    		 int y=50;
    		 public void run(){
    			 while(true){
    				 try{
    					 Thread.sleep(100);
    				 }catch(InterruptedException e){
    					 e.printStackTrace();
    				 }
    				 Graphics graphics=getGraphics();
    				 graphics.setColor(getC());
    				 graphics.drawLine(x, y, 100, y++);
    				 if(y>=80){
    					 y=50;
    				 }
    			 }
    		 }
    	 });
    	 t.start();
    	 }		
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
init(new SleepMethodText(),100,100);
	}
	private static void init(JFrame frame, int width, int height) {
		// TODO Auto-generated method stub
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

}
