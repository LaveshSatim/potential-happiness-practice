package com.beanpostprocessor.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectTracker {
	private static AtomicInteger counter = new AtomicInteger(0);

	public static void increment() {
		counter.incrementAndGet();
	}

	public static int getCounter() {
		return counter.intValue();
	}
}
