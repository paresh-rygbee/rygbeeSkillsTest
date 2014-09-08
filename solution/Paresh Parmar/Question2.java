package solution;

import java.util.Scanner;

/**
 * @author Paresh Parmar
 * Answer 2
 */
public class Question2 
{
  public static void main(String args[])
  {
	   Scanner s=new Scanner(System.in);
	   String InputString=s.nextLine();// Taking the input String from from user;
	   char c[]=InputString.toCharArray();// Input string converted into char Array; 
	   int b=0;
	   for(int i=0;i<InputString.length();i++)
	   {
		   int a=(int) c[i]; 
		   if(a!=b)//if consecutive element comes it prints only first one
			   System.out.print(c[i]);
			   b=a;
	   }
  }
}
