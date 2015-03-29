package sample;

//��������� ���������� Runnable
class LiftOff implements Runnable{
	//1. ������� ���� � �� �������� �� �������������
	protected int countDown = 10; //����� countDown ������ �-��� ������� ����� � �� ������������� ���� 10
	private static int taskCount = 0; // �-��� ��������� �����
	private final int id = taskCount++; // ������������� ������, ������������ �� ������ ������ ������� �-�� �����
	public LiftOff(){} // ���������� ��������� LiftOff
	
	public LiftOff(int countDown) { // �������������� LiftOff �� ����������, �� ����������� �� �-��� ������� �����
	this.countDown = countDown; // ���������� ���������� countDown ��������, ���� ��������� ���������
	}
	public String status(){ // �������� �����, �� ����������� ������� �������� countDown
		return "#"+id+"("+(countDown>0? countDown:"Lift Off!")+"). ";
	}
	public void run(){ //�������� ����� run, �� ������������ ������, ����� �������� ��� ������
		while(countDown-- >0){
			System.out.println(status());
			Thread.yield();	//����� ������������� ������������� �� ���� ������; ������"������
		}
	}
	
}