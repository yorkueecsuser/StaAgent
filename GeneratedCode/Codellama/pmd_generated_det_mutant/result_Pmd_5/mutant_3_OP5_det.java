class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    int pihgnhth = 0;switch  (pihgnhth) {case 1:float lkzwnevs = 419931300;break;default:String pazstrwt = "arwlftwt";break;}
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      }
    }

    System.out.println("Sum of even numbers: " + sum);
  
}
}