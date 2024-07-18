import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
      Vector<Integer> vt=new Vector<>();
      boolean run=true;
      Scanner sc=new Scanner(System.in);
      while(run){
        System.out.println("Enter your Choice");
        System.out.println("1.Enqueue\n2.Dequeue\n3.List\n4.Search\n5.Exit");
        int num=sc.nextInt();
        switch(num){
          case 1:
            System.out.println("Enter a Number");
            int number=sc.nextInt();
            vt.add(number);
            break;
          case 2:
            vt.remove(vt.size()-1);
            break;
          case 3:
            System.out.println(vt);
            break;
          case 4:
            System.out.println("Enter a Number:");
            number=sc.nextInt();
            System.out.println(vt.indexOf(number)!=-1?number+1+" found at "+vt.indexOf(number):"No Element found");
            break;
          case 5:
            run=false;
            break;
        }
        
      }
  }
}