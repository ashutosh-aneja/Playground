import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int x=num%10;
      int y=num/100;
      int z=x+y;
      System.out.println(z);
	}
}