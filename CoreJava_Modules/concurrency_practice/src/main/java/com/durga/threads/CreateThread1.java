package com.durga.threads;

/*
 * @created 12/05/2025 - 20:27
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class CreateThread1 extends Thread{
  public void run(){
    System.out.println("thread is running...");
  }

  public static void main(String[] args) {
    CreateThread1 trd = new CreateThread1();
    trd.start();
  }
}
