package sample;

//Реалізація інтерфейсу Runnable
class LiftOff implements Runnable{
	//1. Описуємо поля і їх значення за замовчуванням
	protected int countDown = 10; //змінна countDown містить к-сть одиниць відліку і за замовчуванням рівна 10
	private static int taskCount = 0; // к-сть запущених задач
	private final int id = taskCount++; // ідентифікатор задачі, присвоюється на одинию більшим поточної к-сті задач
	public LiftOff(){} // оголошення реалізації LiftOff
	
	public LiftOff(int countDown) { // перевантаження LiftOff із параметром, що вказуватиме на к-сть одиниць відліку
	this.countDown = countDown; // присвоюємо властивості countDown значення, рівне введеному аргументу
	}
	public String status(){ // реалізуємо метод, що повертатиме поточне значення countDown
		return "#"+id+"("+(countDown>0? countDown:"Lift Off!")+"). ";
	}
	public void run(){ //реалізуємо метод run, що виконуватиме задачу, тобто міститиме код потоку
		while(countDown-- >0){
			System.out.println(status());
			Thread.yield();	//дозвіл планувальнику переключитись на іншу задачу; необов"язково
		}
	}
	
}