//WAP to check whether a string is palindrome or not.
import java.util.Scanner;
  public class CheckPalindrome{
    public static void main(String args[]){
      PalindromeOrNot p=new PalindromeOrNot();
      p.isPalindrome();
    }
  }
class  PalindromeOrNot{
  public void  isPalindrome(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    String temp="";
    for(int i=s.length()-1;i>=0;i--)
      temp=temp+s.charAt(i);
    if(s.equals(temp))
      System.out.println(s+" is a palindrome");
   else
       System.out.println(s+" is not a palindrome");
  }
}