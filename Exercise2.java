import java.util.*;

public class Exercise2{
   public static void main(String args[]){
      int count=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
           char ch=sc.next().charAt(0);
           count++;
        }
      System.out.println(count);
   }
}