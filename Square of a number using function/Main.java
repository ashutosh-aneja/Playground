import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
   return m*m;
  
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int res=square(n);
      System.out.println(res);
	} 
}