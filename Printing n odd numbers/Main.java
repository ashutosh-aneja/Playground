import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int i=1;
      while(count!=n)
      {
        if(i%2 !=0)
        {
          System.out.println(i);
          count++;
        }
        i++;
      }
    }
}
