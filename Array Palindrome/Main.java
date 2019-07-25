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
      int left=0;
      int right=size-1;
      int not_pal=0;
      while(left<right)
      {
      if(a[left] == a[right])
      {
      left++;
      right--;
        
        
      }
       else
       {not_pal=1;
         break;}
      
      }
      
      if(not_pal == 0)
      { System.out.println("Yes");
      }
      else
        System.out.println("No");
        
      
      
      
    }
  
}