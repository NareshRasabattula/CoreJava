package com.durga.threads;

/*
 * @created 12/05/2025 - 20:27
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CreateThread2 implements Runnable {
     public void run(){
          System.out.println("thread is running...");
     }

     public static void main(String args[]){
          CreateThread2 obj = new CreateThread2();
          Thread trd =new Thread(obj);
          trd.start();
     }
}
