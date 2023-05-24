//WAP to count occurrence of a character in a given string.
import java.util.Scanner;
public class CountOcc{
  public static void main(String args[]){
    CountOccChar f=new CountOccChar();
    f.countOccIs();
  }
}
class CountOccChar{
  public void countOccIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    System.out.println("enter a character to find occurence");
    char ch=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<s.length();i++){
   if(s.charAt(i)==ch){
       count++;
      break;}
    }
      System.out.println("the character "+ch+" occured "+count+" times.");
    if(count==0){
      System.out.println("the character "+ch+" is not found.");
    }
  }
}