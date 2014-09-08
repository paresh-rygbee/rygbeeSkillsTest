package solution;

import java.util.Scanner;
/**
 * @author Paresh Parmar
 * Answer 1
 */
public class Question1 
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   String InputString=s.nextLine();// Taking the input String from from user;
	   char c[]=InputString.toCharArray();// Input string converted into char Array; 
	   int[] s3=new int[125];
	   for(int i=0;i<InputString.length();i++)
	   {
		   int a=(int) c[i];
		   s3[a]++;// count the frequency of char 
		   if(s3[a]==1)
			   System.out.print(c[i]);//print the char if the frequency is exactly one
			   
	   }
	   
   }
}
