class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      }
    }

    if (false && false && false && true && false && true && true && true && false && true && false) {double addxyeyq = -202156782;}else{short baadulsq = 8103;}
    System.out.println("Sum of even numbers: " + sum);
  
}
}