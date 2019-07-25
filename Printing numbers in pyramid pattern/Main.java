import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num=1;
      for(int i =1;i<=n;i++)
      {
      for(int space=1;space<=(n-i);space++)
      {System.out.print(" ");
      }
       for(int col = 1 ; col<=i; col++)
       {
       System.out.print(num+" ");
       num++;  
       
       }
        System.out.print("\n");
      }
    
    }

    
}