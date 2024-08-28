package com.singtel.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		//Queue -> FIFO mechanism
		Queue<Integer> q = new PriorityQueue<>();
		q.offer(10);
		q.offer(5);
		q.offer(89);
		q.offer(3);
		q.offer(4);
		q.offer(15);
		q.offer(15);
		
		//Print the elements in the queue
        System.out.println("List : " + q);
        
        //Print the size of the queue
        System.out.println(q.size());
        
        //Peek at the front element of the queue
        System.out.println(q.peek());
        
        //Remove and return the front element of the queue
        System.out.println(q.poll());
        
        //Print the elements in the queue after polling
        System.out.println("List : " + q);
	}

}
