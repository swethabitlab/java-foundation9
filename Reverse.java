//WAP to find reverse of a string.
import java.util.Scanner;
public class Reverse{
  public static void main(String args[]){
    ReverseChar r=new ReverseChar();
    r.reverseIs();
  }
}
class ReverseChar{
  public void reverseIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String:");
    String s1=sc.nextLine();
    String newStr=" ";
    for(int i=0;i<s1.length();i++){
      newStr=s1.charAt(i)+newStr;
    }
    System.out.println("the reversed string elements are: "+newStr);  
 }
}