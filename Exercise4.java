import java.util.*;
import java.io.*;
public class Exercise4 {
    public static void main(String[] args) throws IOException{
      try{
       Scanner sc=new Scanner(System.in);
       System.out.println(getFibnocci(sc.nextInt()));
      }
      catch(Exception e){
        System.out.println("Invalid Input");
      }
  }
  public static int getFibnocci(int num){
    if(num<=1){
      return num;
    }
    return getFibnocci(num-1)+getFibnocci(num-2);
  }
}