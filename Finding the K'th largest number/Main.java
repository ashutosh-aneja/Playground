import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<n;i++)
      {
      arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      k=n-k;
      int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  }}}
        
      System.out.println(arr[k]);
    
    
    }   
  
  
         }