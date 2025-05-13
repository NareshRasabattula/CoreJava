package com.durga.producer_consumer.advanced;

/*
 * @created 12/05/2025 - 20:23
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class ProducerConsumerAdvanced {
  public static void main(String[] args) throws InterruptedException {
    int cycles = args.length > 0 ? Integer.parseInt(args[0]) : 0;

    Buffer<Integer> buffer = new Buffer<>(3);
    Producer producer = new Producer(cycles, "Producer", buffer);
    Consumer<Integer> consumer1 = new Consumer<>(buffer, producer::isRunning, "Consumer 1");
    Consumer<Integer> consumer2 = new Consumer<>(buffer, producer::isRunning, "Consumer 2");
    producer.start();
    consumer1.start();
    consumer2.start();
    producer.join();
    consumer1.join();
    consumer2.join();
    System.out.println("END");
  }
}
