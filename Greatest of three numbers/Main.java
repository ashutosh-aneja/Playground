import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      
      if(n1>n2 && n1>n3)
        System.out.println(n1);
      if(n2>n1 && n2>n3)
        System.out.println(n2);
      if(n3>n2 && n3>n1)
        System.out.println(n3);
}}