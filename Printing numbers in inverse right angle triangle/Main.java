import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i =1;i<=n;i++)
      {
       int   num=(n-(i-1));
       for(int col = 1 ; col<=(n-(i-1)); col++)
       {
       System.out.print(num);
        num-- ;
       
       }
        System.out.print("\n");
      
    
    
}
	}
}