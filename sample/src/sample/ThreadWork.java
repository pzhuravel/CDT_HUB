package sample;


public class ThreadWork {

	public ThreadWork() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Варіант запуску на виконання одного потоку
//		Thread t = new Thread(new LiftOff()); //створення екземпляру потоку
//		t.start();	//запуск потоку
//		System.out.println("Wait for LiftOff");
		
//		Варіант запуску одразу 5 потоків
		for(int i=0;i<5;i++){
			new Thread(new LiftOff()).start(); 	//запускаємо черговий потік (анонімно)
			System.out.println("Wait for LiftOff");
		}
			
		
		}

}
