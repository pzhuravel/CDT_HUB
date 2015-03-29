package sample;

class Callme {
double sum=0;
public synchronized void CS(double member) {
sum=sum+member;
System.out.println(" member : "+member+"     sum : "+sum);
return;
    }
}
class Caller implements Runnable {
double member;
Callme target;
  public Caller(Callme target, int n){
this.target=target;
double zn=1;
double x=0.3;
double fc=2;
  for (int i=1; i<=n; i+=1,fc=fc*(i+1)) {
this.member=zn*3.14*Math.cos(x+i)/(fc+Math.exp(i*x));
zn=-zn;
        }
         new Thread(this).start();
      }
    public void run() {
target.CS(this.member);
   }
}
class lab2 {
public static void main(String args[]) {
      Callme target=new Callme();
for(int j=1;j<=10;j+=1){
new Caller(target,j);  }
 }
}


