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
      int fac=1;  
       for(int i=1;i<=b;i++)
      {
         fac=fac*i;
      }
     
        sum=sum+fac;
        a=a/10;
      }
      if( sum == n)
      System.out.println("Yes");
      else
      System.out.println("No");  
   
	}
}