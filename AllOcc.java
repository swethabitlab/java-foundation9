//WAP to search all occurrences of a character in given string.
import java.util.Scanner;
public class AllOcc{
  public static void main(String args[]){
    AllOccurrence a=new AllOccurrence();
    a.occIs();
  }
}
class AllOccurrence{
  public void occIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    System.out.println("enter a character you want to find");
    char ch=sc.next().charAt(0);
    for(int i=0;i<s.length();i++){
      if(ch==s.charAt(i))
        System.out.println(ch+" is at "+i);
    }
  }
}