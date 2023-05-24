//WAP to find frequency of each character in a string.
import java.util.Scanner;

public class FrequencyOfElements{
  public static void main(String args[]){
   FrequencyEle f=new FrequencyEle();
    f.frequencyIs();
  }
}
class FrequencyEle{
  public void frequencyIs(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String s=sc.nextLine();
    int count;

    boolean visited[]=new boolean[s.length()];
    for(int i=0;i<s.length();i++){
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)){
          count=count+1;
          visited[j]=true;
          }
      }
        System.out.println("the frequnency of character "+s.charAt(i)+" is:"+count);
      }
    }
  }