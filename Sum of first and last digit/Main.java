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
      int b=n%10;
      while(count>1)
      {
        pow=pow*10;
        count--;
      }
      int c=n/pow;
      int sum=b+c;
      System.out.println(sum);
      
	}
}