package com.durga.producer_consumer;

/*
 * @created 12/05/2025 - 20:26
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CheckAlive implements Runnable {
  public void run(){
    System.out.println("My thread is in running state.");
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[]) throws InterruptedException{
    CheckAlive obj = new CheckAlive();
    Thread     trd = new Thread(obj);
    trd.start();

    while (true) {
      if (trd.isAlive()) {
        System.out.println("Alive");
      } else {
        System.out.println("Dead");
      }
      Thread.sleep(500);
    }
  }
}
