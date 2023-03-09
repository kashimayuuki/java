import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("名字 : ");

    String firstName = scanner.next();

    System.out.println("名前 : ");

    String lastName = scanner.next();

    System.out.println("年齢 : ");

    int age = scanner.nextInt();

    System.out.println("身長 : ");

    double height = scanner.nextDouble();

    System.out.println("体重 : ");

    double weight = scanner.nextDouble();

    Person.printDate(Person.fullName(firstName, lastName), age, height, weight);

  }
}