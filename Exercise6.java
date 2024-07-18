import java.io.*;

public class Exercise6{
   public static void main(String args[]) throws IOException{
      FileInputStream src=null;
      FileOutputStream des=null;
      try{
         src=new FileInputStream("/Users/pranesh-21735/Desktop/source.txt");
         des=new FileOutputStream("/Users/pranesh-21735/Desktop/destination.txt");
         int readuntill;
         while((readuntill=src.read())!=-1){
             des.write(readuntill);
         }
      }
      catch(Exception e){
         e.printStackTrace(); 
      }
      finally{
         if(src!=null){
            src.close();
         }
         if(des!=null){
          des.close();
         }
      }
   }
}