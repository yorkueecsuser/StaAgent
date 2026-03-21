class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      }
    }

    if (false && true && true && true && true && false && true && true && false && false && false) {short fwtguaob = -3248;}else{double glsaprzu = -497620239;}
    System.out.println("Sum of even numbers: " + sum);
  
}
}