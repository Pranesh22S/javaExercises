import java.util.*;
import java.io.*;

public class Exercise8{
    public static void main(String args[]){
       if(args.length<2){
          System.out.println("Input inSufficient");
          return;
       }
       String text=args[0];
       int key=Integer.parseInt(args[1]);
       System.out.println("Entered text :"+text);
       StringBuilder sb=new StringBuilder();
       for(char ch:text.toLowerCase().toCharArray()){
           sb.append((char)((ch-'a'+key)%26+'a'));
       }
       String EncryptedText=sb.toString();
       sb.setLength(0);
       System.out.println("Encrypted Text :"+EncryptedText.toString());
       sb.setLength(0);
       for(char ch:EncryptedText.toCharArray()){
           sb.append((char)((ch-'a'-key)%26+'a'));
       }
       System.out.println("Decrypted Text :"+sb.toString());
    }
}