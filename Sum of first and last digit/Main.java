import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int last=n%10;
     
      while(n>=10)
      {n=n/10;}
      int first=n;
      int sum=last+first;
      System.out.println(sum);
	}
}