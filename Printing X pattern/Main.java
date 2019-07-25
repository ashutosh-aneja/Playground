import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int m=(n/2)+1;
      int k=m;
      for(int r=1;r<=m;r++)
      {
        
        for(int sp=1;sp<=r-1;sp++)
        {
        System.out.print(" ");
        }
        for( int st=1; st<=(2*k-1) ;st++)
        {
            if(st==1)
            System.out.print("*");
            else if(st== (2*k-1) )
            System.out.print("*");
            else
            System.out.print(" ");
            
        
        }
          
        System.out.print("\n");
        k--;
      }
      
      k=2;
      for(int r=m+1;r<=n;r++)
      {
        
        for(int sp=1;sp<=n-r;sp++)
        {
        System.out.print(" ");
        }
        for( int st=1; st<=(2*k-1) ;st++)
        {
            if(st==1)
            System.out.print("*");
            else if(st== (2*k-1) )
            System.out.print("*");
            else
            System.out.print(" ");
            
        
        }
          
        System.out.print("\n");
        k++;
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}
}