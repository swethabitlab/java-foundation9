//WAP to first occurrence of a character in a given string.
import java.util.Scanner;
public class FirstOcc{
  public static void main(String args[]){
    FirstOccChar f=new FirstOccChar();
    f.firstOccIs();
  }
}
class FirstOccChar{
  public void firstOccIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
   
    for(int i=0;i<s.length();i++)
      System.out.println("first occurence of a character is: "+s.indexOf(s.charAt(i)));
    }
  }
