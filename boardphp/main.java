class Main {
  public static void main(String[] args) {
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones", 27);
    printData("John Christopher Smith", 65);
    
  }

  // 引数を受け取るようにしてください
  public static void printData(String name, int age) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    
  }
}