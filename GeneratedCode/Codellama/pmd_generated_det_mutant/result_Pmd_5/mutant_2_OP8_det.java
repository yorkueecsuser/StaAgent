class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] ezxciudb = {1, 2, 3, 4, 5};
    int auhmlxnc = 0;

    for (int i = 0; i < ezxciudb.length; i++) {
      if (ezxciudb[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        auhmlxnc += ezxciudb[i];
      }
    }

    System.out.println("Sum of even ezxciudb: " + auhmlxnc);
  }
}