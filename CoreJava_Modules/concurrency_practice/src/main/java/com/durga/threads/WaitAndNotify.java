package com.durga.threads;

/*
 * @created 12/05/2025 - 21:04
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class WaitAndNotify {
  public static void main(String[] args) throws InterruptedException{
    ThreadX b = new ThreadX();
    b.start();

    synchronized(b){
      System.out.println("Waiting for b to complete...");
      b.wait();
      System.out.println("Execution back to main Thread");
    }
  }
}

class ThreadX extends Thread{
  int total;
  @Override
  public void run(){
    synchronized(this){
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      notify();
    }
  }
}
