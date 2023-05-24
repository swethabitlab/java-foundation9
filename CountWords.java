//WAP to count total number of words in a string.
import java.util.Scanner;
public class CountWords{
  public static void main(String args[]){
    Count c=new Count();
    c.countIs();
  }
}
class Count{
  public void countIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    String countwords[]=s.split(" ");
    System.out.println("total number of words in string:"+countwords.length);
  }
}