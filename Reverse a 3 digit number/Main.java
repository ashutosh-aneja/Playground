import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=a%10;
    int d=a/10;
    int c=d%10;
    int e=d/10;
    int rev=(b*100)+(c*10)+(e);
    System.out.println(rev);
    
    
  }
}