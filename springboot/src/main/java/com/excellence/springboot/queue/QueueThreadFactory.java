package com.excellence.springboot.queue;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class QueueThreadFactory implements ThreadFactory{
	
	private static final AtomicInteger poolnum = new AtomicInteger(1);
	private static final AtomicInteger threadnum = new AtomicInteger(1);
	private ThreadGroup group;
	private String namePrefix;
	
	@Override
	public Thread newThread(Runnable r) {
		Thread thread=new Thread(group, r, namePrefix+threadnum.getAndIncrement());
		return null;
	}

}
