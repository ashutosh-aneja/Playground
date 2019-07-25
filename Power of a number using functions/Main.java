import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int base = sc.nextInt();
    int exp = sc.nextInt();
    int num = pow(base,exp);
    System.out.println(num);
  }
  public static int pow(int b,int ex)
  { int n=1;
    for(int i=1;i<=ex;i++)
    { 
      n=n*b;
    }
    return n;
  }
}