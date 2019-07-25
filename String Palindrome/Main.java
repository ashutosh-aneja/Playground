import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int e=str.length()+1,f=0;
      for(int i=0;i<((str.length()/2)+1);i++)
      {
        char ch=str.charAt(i);
      if(ch==str.charAt(str.length()-i-1))
      { f++;
       e--;
      }}
     
        if(e==f)
          System.out.println("Yes");
        else
          System.out.println("No");
          
      }
    } 
