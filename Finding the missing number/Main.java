import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0; i< size ;i++)
      {
      a[i]=sc.nextInt();
      }
      int temp[]=new int[size];
      for(int i=0;i<size;i++)
      {
      temp[i]=0;
      
      }
       for(int i=0;i<size;i++)
      {
       int n=a[i];
       temp[n-1]=1;  
      
      }
       for(int i=0;i<size;i++)
      {
      if(temp[i]==0)
        System.out.println(i+1);
      }
      
      
      
      
      
      
    }
}