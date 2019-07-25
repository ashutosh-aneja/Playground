import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = greatest_of_2_numbers(n1, n2);// Function call
	    System.out.print(greatest_of_2_numbers(result, n3));// Function call
	}
	// Function to find the greatest of 2 numbers
	public static int greatest_of_2_numbers(int num1, int num2)
	{
	    int min,num=0;
	    if(num1 > num2){
	        min = num2;
	    }
	    else{
	        min = num1;
	    }
	    while(min>=1)
        {
          if((num1%min==0)&&(num2%min==0))
          {
            num=min;
            break;
          }
          min--;
          
        }
      return num;
	}
}