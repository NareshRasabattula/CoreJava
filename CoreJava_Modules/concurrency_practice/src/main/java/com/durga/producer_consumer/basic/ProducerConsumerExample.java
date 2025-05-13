package com.durga.producer_consumer.basic;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @created 12/05/2025 - 20:20
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class ProducerConsumerExample {
  public static void main(String[] args) throws InterruptedException {
    int cycles = args.length > 0 ? Integer.parseInt(args[0]) : 0;

    Queue<Integer> queue = new LinkedList<>();

    Producer producer = new Producer(queue, 3, cycles, "Producer");
    Consumer consumer1 = new Consumer(queue, producer.getProducerState(), "Consumer 1");
    producer.start();
    consumer1.start();
    producer.join();
    consumer1.join();
    System.out.println("END");
  }
}
