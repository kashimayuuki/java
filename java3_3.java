class Main {
  public static void main(String[] args) {
    printData(fullName("kasima", "yuuki"), 31, 1.79, 84);

    // fullNameメソッドを用いて、printDataの引数を書き換えてください
    printData(fullName("John", "Christopher", "Smith"), 45,1.91, 90);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "歳です");
    System.out.println("体重は" + weight + "歳です");

    double bmi = bmi(height,weight);

    System.out.println("BMIは" + bmi + "です");

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String middleName, String lastName){
    return firstName + " " + middleName + " " + lastName;
  }

  public static double bmi(double height, double weight){
    return weight/height/height;
  }

}
