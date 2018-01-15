package br.com.sidney.hashi.impl;



import br.com.sidney.hashi.Task;
import br.com.sidney.hashi.Worker;

public class Developer implements Worker {
	
	private Task task;
	
	public Developer(Task task){
		this.task = task;
	}

	public void doTask() {
		System.out.println("Developer.");
		this.task.startTask();
	}

}
