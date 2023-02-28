class Main{
  public static void main(String[]args){
    String name = fullName("Kashima","Yuuki");

    printDate(name,31);

  }
  public static void printDate(String name,int age){
    System.out.println("名前は"+name+"です");

    System.out.println("年齢は"+age+"です");
  }

  public static String fullName(String firstName,String lastName){
    return firstName+""+lastName;
  }
}