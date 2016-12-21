package com.examples.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

public class ProducerConsumerUsingTransferQueueTest 
{
  public static void main(String[] args) 
  {
    int totalSize = 10;
	BlockingQueue<Item> sharedData = new LinkedTransferQueue<>();
	Thread producer = new Thread(new Producer(sharedData, totalSize), "Producer");
	Thread consumer = new Thread(new Consumer(sharedData), "Consumer");
		    
	producer.start();
	consumer.start();
  }
}
