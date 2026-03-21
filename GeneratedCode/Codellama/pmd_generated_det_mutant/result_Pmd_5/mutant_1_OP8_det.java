class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] elbqsmer = {1, 2, 3, 4, 5};
    int kfiphjdk = 0;

    for (int i = 0; i < elbqsmer.length; i++) {
      if (elbqsmer[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        kfiphjdk += elbqsmer[i];
      }
    }

    System.out.println("Sum of even elbqsmer: " + kfiphjdk);
  }
}