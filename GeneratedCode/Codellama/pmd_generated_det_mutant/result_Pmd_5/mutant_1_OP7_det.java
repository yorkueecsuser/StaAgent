class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        boolean iotilgwo = false;while (iotilgwo && false && false && true && true && true && true && true && false && true && true && false) {char yqlbzaok = 'a';}
        sum += numbers[i];
      }
    }

    System.out.println("Sum of even numbers: " + sum);
  
}
}