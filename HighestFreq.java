//WAP to find highest frequency character in a string.
import java.util.Scanner;
public class HighestFreq{
  public static void main(String args[]){
    Highest h=new Highest();
    h.highestFreqIs();
 }
}
class Highest{
  public void highestFreqIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String:");
    String str=sc.nextLine();
    int s=str.length();
    char maxChar=str.charAt(0);
    
  
     for(int i=0;i<s;i++){
       char ch=str.charAt(i);
       int count=1;
    boolean visited[]=new boolean[s];
     for( i=0;i<s;i++){
      if(visited[i]==true)
        continue;
       count=1;
       for(int j=i+1;j<s;j++){
         if(str.charAt(i)==str.charAt(j)){
           count++;
           visited[j]=true;
         }
       }
       if(count>1){
         s=count;
         maxChar=str.charAt(i);
       }
     } 
      System.out.println(maxChar+" is occured "+count+" times"); 
      
   }
 }
}