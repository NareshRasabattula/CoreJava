package com.durga.producer_consumer.advanced;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/*
 * @created 12/05/2025 - 20:22
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class Buffer<T> {
  private final Queue<T> queue;
  private final int capacity;

  private ReentrantLock lock = new ReentrantLock(true);

  private AtomicBoolean isFull = new AtomicBoolean(false);
  private AtomicBoolean isEmpty = new AtomicBoolean(true);

  public Buffer(final int capacity) {
    if (capacity <= 0) throw new IllegalArgumentException("Buffer capacity can't be less or equal to 0");
    this.queue = new LinkedList<>();
    this.capacity = capacity;
  }

  public boolean put(T e) {
    if (e == null) throw new IllegalArgumentException("Nulls not allowed");
    lock.lock();

    try {
      if (queue.size() == capacity) {
        this.isFull.set(true);
        //TODO here we lose value
        return false;
      }

      queue.add(e);
      System.out.println("Element added: " + Arrays.toString(queue.toArray()));
      return true;
    } finally {
      lock.unlock();
    }
  }

  public T get() throws NoSuchElementException {
    lock.lock();

    try {
      T poll = queue.remove();
      System.out.println("Element removed: " + Arrays.toString(queue.toArray()));
      if (queue.isEmpty()) this.isEmpty.set(true);
      else this.isFull.set(false);
      return poll;
    } finally {
      lock.unlock();
    }
  }
}
