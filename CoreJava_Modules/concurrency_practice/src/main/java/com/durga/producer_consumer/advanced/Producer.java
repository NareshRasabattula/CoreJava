package com.durga.producer_consumer.advanced;

import java.util.concurrent.atomic.AtomicBoolean;

/*
 * @created 12/05/2025 - 20:23
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class Producer<T> extends Thread {
  private final Buffer<Integer> buffer;
  private final int cyclesCount;

  private final AtomicBoolean isRunning = new AtomicBoolean();

  private static final int DEFAULT_CYCLES_COUNT = 10;

  public Producer(final int cyclesCount, final String threadName, final Buffer<Integer> buffer) {
    super(threadName);
    if (buffer == null) throw new IllegalArgumentException("Cannot construct producer instance");
    this.cyclesCount = cyclesCount > 0 ? cyclesCount : DEFAULT_CYCLES_COUNT;
    this.buffer = buffer;
  }

  public boolean isRunning() {
    return isRunning.get();
  }

  @Override
  public void run() {
    int value = 0;
    int currentCycle = 0;
    this.isRunning.set(true);
    while (currentCycle < cyclesCount) {
      currentCycle++;
      try {
        boolean isSuccessfulPut = put(value);
        value += isSuccessfulPut ? 1 : 0;
        if (!isSuccessfulPut) System.out.printf("%s: Can't put value: %d%n", this.getName(), value);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.isRunning.set(false);
    System.out.printf("---------End of %s job---------%n", this.getName());
  }

  private boolean put(int value) throws InterruptedException {
    Thread.sleep(100);
    System.out.printf("%s: Producing value: %d%n", this.getName(), value);
    return buffer.put(value);
  }
}
