import java.io.*;

public class Exercise2_1{
     public static void main(String[] args) throws IOException{
       InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader bfr=new BufferedReader(in);
       int count=0;
       try{ 
          int read;
          while((read=bfr.read())!=-1){
             count++;
          }
       }
       catch(Exception e){
          System.out.println(e);
       }
       System.out.println("Number of Characters Entered :"+count);
    }
}