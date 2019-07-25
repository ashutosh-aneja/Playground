import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code 
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    int len1=str1.length();
    int len2=str2.length();
    int count=0;
    for(int i=0;i<(len1-(len2-1));i++)
    {
    if(str2.equals(str1.substring(i,i+len2)))
      count++;
      
    }
    System.out.println(count);
  } 
}