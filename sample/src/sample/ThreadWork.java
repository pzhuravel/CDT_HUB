package sample;


public class ThreadWork {

	public ThreadWork() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		������ ������� �� ��������� ������ ������
//		Thread t = new Thread(new LiftOff()); //��������� ���������� ������
//		t.start();	//������ ������
//		System.out.println("Wait for LiftOff");
		
//		������ ������� ������ 5 ������
		for(int i=0;i<5;i++){
			new Thread(new LiftOff()).start(); 	//��������� �������� ���� (�������)
			System.out.println("Wait for LiftOff");
		}
			
		
		}

}
