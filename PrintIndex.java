import java.util.Scanner;

public class PrintIndex{
  public static void main(String args[]){
     IndexAt i=new IndexAt();
    i.indexAt();
  }
}
class IndexAt{
  public void indexAt(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string:");
    String str=sc.nextLine();
    System.out.println("enter a character:");
    char ch=sc.next().charAt(0);
    int index=str.indexOf(ch);
    if(index>=0){
      System.out.println(" the character "+ch+" is at the index "+index);
    }
      else{
        System.out.println("the character "+ch+ " does not exist in the string");
      }
  } 
}