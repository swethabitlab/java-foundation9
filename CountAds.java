//program to count alphabets,digits,special characters in a string.
import java.util.Scanner;
public class CountAds{
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string : ");
    String str=sc.nextLine();
  
    int count=0,count1=0,count2=0;
     for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
      count++;
      }
       else if(ch>='0' && ch<='9'){
         count1++;
       }
       else{
         count2++;
       }
    } 
      System.out.println("the total alphabets are :"+count);
      System.out.println("the total digits are :"+count1);
      System.out.println("the total special symbols are :"+count2);
  }
}