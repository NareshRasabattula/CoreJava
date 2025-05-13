package com.durga.locks;

import java.util.concurrent.locks.StampedLock;

/*
 * @created 13/05/2025 - 05:24
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class UserRecord {
  private final StampedLock lock = new StampedLock();
  private volatile int balance;
  //other user fields...

  public void updateBalance(int amount) {
    long stamp = lock.writeLock();
    try {
      if (balance + amount < 0) {
        Thread.sleep(10000);
        return;
      }

      Thread.sleep(10000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } finally {
      lock.unlockWrite(stamp);
    }

    this.balance += amount;
  }

  public int getBalance() {
    long stamp = lock.readLock();
    try {
      return balance;
    } finally {
      lock.unlockRead(stamp);
    }
  }
}
