import java.util.*;
import java.io.*;
import java.util.Hashtable;
public class Exercise11{
   private static String FileName="data.txt";
   private static Scanner sc=new Scanner(System.in);
   private static Hashtable<String,Long> PhoneBook=new Hashtable<>();
     public static void main(String[] args) {
      loadDataFromFile();
      boolean run=true;
      while(run){
        System.out.println("Enter your Choice");
        System.out.println("1.Add Number\n2.Delete Number\n3.List All\n4.Search\n5.Exit");
        int num=sc.nextInt();
        switch(num){
          case 1:
            try{
              System.out.println("Enter Your Name and Number");
              String Name=sc.next();
              Long number=sc.nextLong();
              PhoneBook.put(Name,number);
            }
            catch(Exception e){
              System.out.println("Invalid Input");
            }
            break;
          case 2:
            System.out.println("Enter your Name to Delete");
            String name=sc.next();
            if(PhoneBook.containsKey(name)){
                PhoneBook.remove(name);
            }
            else{
                System.out.println("Name Does'nt Exist");
            }
            saveDatatoFile();
            break;
          case 3:
            System.out.println("Contact List");
            for(Map.Entry<String,Long> pb:PhoneBook.entrySet()){
               System.out.println(pb.getKey()+":"+pb.getValue());
            }
            break;
          case 4:
            System.out.println("Enter a Name");
            String searchName=sc.next();
            if(PhoneBook.containsKey(searchName)){
               System.out.println(PhoneBook.get(searchName));
            }
            else{
               System.out.println("No Doesn't Exist");
            }
            break;
          case 5:
            run=false;
            saveDatatoFile();
            break;
        }
        
      }
   }
   public static void saveDatatoFile(){
       try{
          BufferedWriter bfr=new BufferedWriter(new FileWriter(FileName));
          for(Map.Entry<String,Long> pb:PhoneBook.entrySet()){
               bfr.write(pb.getKey().toString()+":"+pb.getValue().toString());
               bfr.newLine();
               bfr.flush();
       
          }
       }
       catch(IOException e){
          System.out.println("Exception Occurred");
       }
    }
    public static void loadDataFromFile(){
      try{
         BufferedReader bfr=new BufferedReader(new FileReader(FileName));
         String str;
         while((str=bfr.readLine())!=null){
            String[] a=str.split(":");
            PhoneBook.put(a[0],Long.parseLong(a[1]));
         }
      }
      catch(IOException e){
         System.out.println("Error in Reading");
      }
   }
}