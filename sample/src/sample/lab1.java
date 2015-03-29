package sample;
import java.util.*;
public class lab1 {	

	public double First(double x) 
		{
		double s = 0;
		for(int i=1;i<=10;i++){
			s+=f(x,i);
			System.out.println("i = "+i+", s = "+s);
		}
		return s;
		}

	public double Second(double x,double e) 
		{
		double s = 0;
		int i = 0;
		double y = 0;
		double y0 = 0;
		do	{	
			y0 = y;
			i++;
			y = f(x,i);
			s+=y;
			System.out.println("i = "+i+", s = "+s);
			}while(Math.abs(y-y0)>=e);
		return s;
		}

	public long  Factorial(long i)	
		{
		long g = 1;
		if(i==0||i==1) return g;
		else{
			g = i*Factorial(i-1);
			return g;
		}
	}

	public double f(double x, int i)
	{
	int z = -1;
	if((i+1)%2 ==0) z = 1;
	double y = z*3.141596*Math.cos(x+i)/(Factorial(i+1)+Math.exp(i*x)); 	
	return y;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть x: ");
		double x = sc.nextDouble();
		System.out.print("Введіть e: ");
		double e = sc.nextDouble();
		sc.close();	
/*	double x = 0.3;
	double e = 0.0000001;
*/		lab1 p = new lab1();
		System.out.printf("%nМетод № 1%n");
		double res1 = p.First(x);
		System.out.println("Результат розрахунку = "+res1);		
		System.out.printf("%n%nМетод № 2%n");
		double res2 = p.Second (x,e);
		System.out.println("Результат розрахунку = "+res2);		
		}

}
