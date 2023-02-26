class Main{
  public static void main(String[]args){
    hello();
      // 引数に「Kate Jones」を渡してください
    printData("Kate Jones",15);

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith", 60 );

  }
  public static void hello(){
    System.out.println("Hello Java");
  }

  // 引数を受け取るようにしてください
  public static void printData(String name, int age) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は"+ name +"です");

    System.out.println("年齢は"+age+"歳です");

  }

}