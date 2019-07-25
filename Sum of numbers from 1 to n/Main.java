import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int sum=0;
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<=n;i++)
      {
         sum=sum+i;
          
      }
      System.out.println(sum);
	}
  
  
}