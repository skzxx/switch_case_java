import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    /*Dimana program dijalankan*/
    String OperatorInputScanner;
    Scanner OperatorInputScanner_User = new Scanner(System.in);
    System.out.print("Masukan karakter (nama) \n");
    OperatorInputScanner = OperatorInputScanner_User.next();
    switch(OperatorInputScanner) {
      case "otong":
        System.out.print("Ini otong");
        break;
        case "ucup":
          System.out.print("Ini ucup");
          break;
          default:
          System.out.print("Ini sistem default");
    }
  }
}