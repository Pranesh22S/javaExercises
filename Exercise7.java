import java.io.*;

public class Exercise7{
   public static void main(String args[]) throws IOException{
      File file = new File("/Users/pranesh-21735/Desktop/source7.txt");
      try{
         BufferedReader bfr=new BufferedReader(new FileReader(file));
         String readLines;
         int countOfLines=0;
         while((readLines=bfr.readLine())!=null){
            System.out.print(++countOfLines+":");
            System.out.println(readLines);
         }
      }
      catch(Exception e){
          e.printStackTrace();
      }
   }
}