package br.com.sidney.hashi.main;



import br.com.sidney.hashi.Task;
import br.com.sidney.hashi.Worker;
import br.com.sidney.hashi.impl.Code;
import br.com.sidney.hashi.impl.Developer;
import br.com.sidney.hashi.impl.Meeting;
import br.com.sidney.hashi.impl.Test;
import br.com.sidney.hashi.impl.Tester;

public class BridgeDemo {
	
	public static void main(String[] args){
		
		Task code = new Code();
		Task test = new Test();
		Task meeting = new Meeting();
		
		Worker developer = new Developer(code);
		developer.doTask();
		
		Worker tester = new Tester(test);
		tester.doTask();
		
		Worker otherDeveloper = new Developer(meeting);
		otherDeveloper.doTask();
	}

}
