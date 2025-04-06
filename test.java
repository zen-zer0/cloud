import java.util.Scanner;

public class test {
   public static void main(String[] args){
      System.out.println("Test drive");
      Scanner scan = new Scanner(System.in);
      System.out.print("Test scanner: ");
      String ts = scan.nextLine();
      System.out.println("result: "+ ts);
   }
}