class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    if (true && true && false && false && false && true && true && false && false && true && false) {boolean ielfzvkk = false;}
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      }
    }

    System.out.println("Sum of even numbers: " + sum);
  
}
}