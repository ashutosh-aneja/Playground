import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n;
      int digits=0,sum=0;
     while(a>0)
     {
       a=a/10;
       digits++;
     } 
    
      a=n;
      while(a>0)
      {
      int b=a%10;
      int pow=1;  
      for(int i=0;i<digits;i++)
      { 
         pow=pow*b;
      }
        sum=sum+pow;
        a=a/10;
      }
      if( sum == n)
      System.out.println("Armstrong Number");
      else
      System.out.println("Not a Armstrong Number");  
   
	}
}