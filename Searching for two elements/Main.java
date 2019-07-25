import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
      int first = in.nextInt();
      int second = in.nextInt();
      int num1=0,num2=0,flag1=0,flag2=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         if(first==arr[idx])
         {num1=idx;
           flag1=1;
         }
        if(second==arr[idx])
        {  num2=idx;  
           flag2=1;
        }
      }
     if(flag1!=1)
       num1=-1;
      if(flag2!=1)
       num2=-1;
     
     System.out.println(num1);
     System.out.println(num2);
     
   }
}

