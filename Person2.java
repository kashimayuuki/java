import java.lang.Math;

class Person1{
  public static void printData(String name, int age, double height, double weight) {
  System.out.println("私の名前は" + name + "です");
  System.out.println("年齢は" + age + "歳です");
  System.out.println("身長は" + height + "歳です");
  System.out.println("体重は" + weight + "歳です");

  double bmi = bmi(height,weight);

  System.out.println("BMIは" + Math.round(bmi) + "です");

  if(isHealthy(bmi)){
    System.out.println("健康です");
  }else{
    System.out.println("不健康です");
  }

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

  public static boolean isHealthy(double bmi){
    return bmi >= 18.5 && bmi < 25 ;
  }

}