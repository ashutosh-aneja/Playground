import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your co	//Try your code here
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++)
    {
    a[i]=sc.nextInt();
    }
    int rt=sc.nextInt();
    rotate(a,size,rt);
     for(int i=0;i<size;i++)
    {
    System.out.print(a[i]+" ");
    }
   
  	}
  public static void rotate(int a[],int size,int rt)
  {
  int b[]=new int[size];
   int c[]=new int[size];
    int o=0,p=0;
    for(int i=0;i<size;i++)
    {
    if(i%2==0)
    {
    b[o]=a[i];
    o++;  
    }
    else
    {c[p]=a[i];
      p++ ;} 
    }
    
    for(int j=1;j<=rt;j++)
    {
    int temp=c[0];
      for(int index=1;index<=(p-1);index++)
      {
      c[index-1]=c[index];
      }
      c[p-1]=temp;
      
      
      int temp2=b[0];
      for(int in=0;in<(o-1);in++)
      {
        int temp1=b[in+1];
      b[in+1]=temp2;
        temp2=temp1;
        
      }
      b[0]=temp2;
    
    }
    o=0;p=0;
     for(int i=0;i<size;i=i+2)
    {
       a[i]=b[o];
       
       o++;
       
    
    }
     for(int i=1;i<size;i=i+2)
    {
   a[i]=c[p];
       p++;
    }
    
    
    
  
  }
  
}