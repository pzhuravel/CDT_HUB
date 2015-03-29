package sample;

import java.util.concurrent.*;
import java.util.*;

class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id){	//метод для присвоєння потоку ідентифікатора
		this.id = id;
	}
	public String call(){	//еквівалент run, що повертає результат (тут - у вигляді рядка)
		return "Результат: "+id;
	}
	
}

public class CallableDemo {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i=0;i<10;i++){
			results.add(exec.submit(new TaskWithResult(i)));
		}
		for(Future<String> fs:results){
			try{
				System.out.println(fs.get());
			}
			catch(InterruptedException e){
				System.out.println(e);
				return;
			}
			catch(ExecutionException e){
				System.out.println(e);
			}
			finally{
				exec.shutdown();
			}
		}

	}
}
