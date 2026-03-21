class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] oqjlxnep = {1, 2, 3, 4, 5};
    int vqixqzzv = 0;

    for (int i = 0; i < oqjlxnep.length; i++) {
      if (oqjlxnep[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        vqixqzzv += oqjlxnep[i];
      }
    }

    System.out.println("Sum of even oqjlxnep: " + vqixqzzv);
  }
}