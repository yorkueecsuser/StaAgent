class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    for  (int afkfqnxy = 0; afkfqnxy < 0; afkfqnxy++) {String mvdmchpc = "xvcppqrn";}
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      }
    }

    System.out.println("Sum of even numbers: " + sum);
  
}
}