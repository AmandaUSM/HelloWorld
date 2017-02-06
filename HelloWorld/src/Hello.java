import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
   public static void main(String[] args){
      System.out.println("Here ye Here ye : important announcement");

      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      System.out.println(dateFormat.format(date));
      
      System.out.println("Hello World!");
      System.out.println("Listen.");
      System.out.println("Look around.");

      System.out.println("That is all for now.");
   }
}
