import java.util.*;
import java.util.concurrent.TimeUnit;
public class PrimeFinder extends Thread{
    public void run(){
      for(int i=1;i<=100;i++){
        if(isPrime(i)){
          System.out.println("Prime Numbers :"+i);
        }
        try{
          TimeUnit.SECONDS.sleep(1);
        }
        catch(Exception e){
          e.printStackTrace();
        }
      }
    }
    public boolean isPrime(int a){
      if(a==1 || a==2){
        return true;
      }
      for(int i=2;i<a;i++){
        if(a%i==0){
          return false;
        }
      }
      return true;
    }
}