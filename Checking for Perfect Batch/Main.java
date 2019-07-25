import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=(n-1);i++)
    {
    arr[i]=sc.nextInt();  
    }
    
    batch(arr,n);
    
  }
  public static void batch(int arr[],int n)
  {
   int m=n/3;
    int sum=0,k=0,l=3,a=0,i;
    int b[]=new int[m];
    for(int j=1;j<=m;j++){
      
  for( i=k;i<l;i++)
  {
  sum=sum+arr[i];
  }
     
      k=l;
      l=l+3;
      b[a]=sum;
      a++;
       sum=0;
    }
    int x=b[0];
   
    int flag=0;
    for( i=0;i<m;i++)
    {
    if(b[i]==x)
      flag=1;
    else
      flag=-1;
      
    }
    
    if(flag==1)
      System.out.println("Perfect Batch");
    if(flag==-1)
      System.out.println("Not a Perfect Batch");
    
    
  }
  
}