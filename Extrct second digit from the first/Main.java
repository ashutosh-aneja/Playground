import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n;
      int count=0;
      int pow=1;
      while(a>0)
      {
        a=a/10;
        count++;
      }
      while(count>2)
      {
        pow=pow*10;
        count--;
      }
      int d=n/pow;
      int f=d%10;
      System.out.println(f);
      
     
      
	}
}