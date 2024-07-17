import java.io.*;
class Exercise1{
   public static void main(String args[]) throws IOException{
     DataInputStream inputstream=new DataInputStream(System.in);
     try{
        String Name=inputstream.readLine();
        System.out.print("Enter Your Name : ");
        System.out.println(Name);
     }
     catch(Exception e){
        System.out.println(e);
     }
   }
}