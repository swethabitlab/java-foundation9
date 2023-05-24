//simple program on Strings.

public class Prgm{
  public static void main(String args[]){
    String s1;
    s1="swetha";//using String literal
    String s2=new String("swetha");//using new operator
    char ch[]={'b','i','t','l','a','b','s'};//using character array
    String s3=new String(ch);
    //print the result
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}