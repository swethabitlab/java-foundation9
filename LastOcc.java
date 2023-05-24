//WAP to last occurrence of a character in a given string.
import java.util.Scanner;
public class LastOcc{
  public static void main(String args[]){
    LastOccChar f=new LastOccChar();
    f.lastOccIs();
  }
}
class LastOccChar{
  public void lastOccIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
   
    for(int i=0;i<s.length();i++)
      System.out.println(s.lastIndexOf(s.charAt(i)));
    }
  }