import java.util.Scanner;

class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前は: ");
    String firstName = scanner.next();

    System.out.print("名字は: ");
    String lastName = scanner.next();


    System.out.println("名前は" +firstName+lastName +"です");
  }
}