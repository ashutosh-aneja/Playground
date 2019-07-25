import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int [size];
      for(int i=0;i<size;i++)
      {
      a[i]=sc.nextInt();
      }
      
      for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++)
      {
        for(int k=j+1;k<size;k++)
        {
        System.out.print("("+a[i]+", "+a[j]+", "+a[k]+") ");
        
        }}
        if(i!=size-1)
        System.out.print("\n");
    
      }
}}