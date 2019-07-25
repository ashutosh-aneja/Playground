import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      String temp=str1.concat(str1);
      int printt=0;
      for(int i=0;i<(temp.length()-(str2.length() -1));i++)
      {
        if(str2.equals(temp.substring(i,i+str2.length())))
          printt=1;
        
      
      }
      if(printt==1)
        System.out.println("Yes");
      else
        System.out.println("No");
      
    }
}