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
    
    int res=search(arr,n);
    System.out.println(res);
  }
  public static int search(int arr[],int n)
  {
    int index=0;
  int num=arr[0];
  for(int i=0;i<n;i++)
  {
  if(num<arr[i])
  {
  num=arr[i];
  index=i;
  }
  
  }
  return index;
  }
}