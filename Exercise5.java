import java.util.*;
import java.text.SimpleDateFormat;
public class Exercise5{
    public static void main(String[] args) {
      Date d=new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
      sdf.setTimeZone(TimeZone.getTimeZone("IST"));
      System.out.println(sdf.format(d));
  }
}