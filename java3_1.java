class Main{
  public static void main(String[]args){
    hello();
      // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith");

  }
  public static void hello(){
    System.out.println("Hello Java");
  }

  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は"+ name +"です");

  }

}