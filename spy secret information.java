/* Question 
Input: A single line input string without any space in between
  Output:A single line of output contains the decrypted output String.
  i.e. All the lowercase and Special charcters present in the String are removed to give the output String.
  The UpperCase letters and numbers are displayed in the same order as in the input.
  eg: input:1ab$#100MAghGI*^%C00%11
      output:1100MAGIC0011*/
      
      
import java.util.*;

public class Program1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String s="1ab$#100MAghGI*^%C00%11";
    char ar[]=new char[s.length()];
    for(int i=0;i<s.length();i++)
    {
    	ar[i]=s.charAt(i);
    }
    for(int i=0;i<s.length();i++)
    {
    	if((ar[i]>=48 && ar[i]<=57))  // Work on ASCII Value
    	{
    		System.out.print(ar[i]);
    	}
    	else if((ar[i]>=65 && ar[i]<=90))
    	{
    		System.out.print(ar[i]);
    	}	
    }   
	}

}
