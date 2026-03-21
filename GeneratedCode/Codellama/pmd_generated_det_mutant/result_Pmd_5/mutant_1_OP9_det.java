class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    { int i = 0; do { if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      } i++; } while (i < numbers.length); }

    System.out.println("Sum of even numbers: " + sum);
  }
}