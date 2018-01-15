package br.com.sidney.hashi.impl;



import br.com.sidney.hashi.Task;
import br.com.sidney.hashi.Worker;

public class Tester implements Worker {
	
	private Task task;
	
	public Tester(Task task){
		this.task = task;
	}

	@Override
	public void doTask() {
		System.out.println("Tester.");
		this.task.startTask();

	}

}
