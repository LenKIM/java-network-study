package org.example.len.ch16_advenced.queue;


import org.example.len.ch16_advenced.event.Job;

public interface Queue {
	
	Job pop(int eventType);
	void push(Job job);

}
