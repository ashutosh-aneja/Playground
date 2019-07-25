import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
    Scanner sc=new Scanner(System.in);
    int base = sc.nextInt();
    prime(base);
    
	}
   public static void prime(int b)
  { 
     for(int i=2;i<=b;i++){
     int num=2;
     int is_prime=1;
     while(num<=i/2)
     {
       if(i%num==0)
       {
         is_prime=0;
         break;
       }
     num=num+1;
     }
     if(is_prime==1)
        System.out.println(i);
     }
  }
}