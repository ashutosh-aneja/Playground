import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++)
    {
    a[i]=sc.nextInt();
    }
    
    end(a,size);
    
    }
  public static void end(int a[],int size)
  {
  
    int o=0,p=0;
    for(int i=0;i<size;i++)
    {
    if(a[i]==0)
    {o++;
    }
    else
    {a[p]=a[i];
      p++;}
     }
  

    for(int i=0;i<o;i++)
      
    {
      a[p]=0;
      p++;
      
    }
    for(int i=0;i<size;i++)
      
    {
      
      System.out.print(a[i]+" ");
    }
  
}}