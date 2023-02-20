class Main{
  public static void main(String[]args){
    int number = 15;

    if(number < 10){
      System.out.println("10より小さい");
    }else if(number < 20){
      System.out.println("10以上,20以下");
    }else{
      System.out.println("20以上");
    }

    int n = 0;

    // switch文を用いて、変数nの値に応じて条件分岐をしてください
    switch (n){
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
      default:
        System.out.println("凶です");
        break;
    }
  }
}