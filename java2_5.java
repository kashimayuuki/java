class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

    // for文を用いて、「私の名前は◯◯です」と出力してください
    for (int i = 0 ; i< names.length; i++){
      System.out.println("私の名前は" + names[i] + "です");
    }

    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for (String name:names){
      System.out.println("私の名前は"+name+"です");
    }

    int[] numbers = {1,4,5,8,9,13,2,14,};

    int oddSum = 0 ;

    int evenSum = 0 ;

    for(int number: numbers){
      if(number % 2 == 0){
        evenSum += number ;
      }else{
        oddSum += number ;
      }
    }

    System.out.println("偶数の合計は"+evenSum);
    System.out.println("奇数の合計は"+oddSum);
  }
}