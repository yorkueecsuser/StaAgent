import edu.umd.cs.findbugs.annotations.NoWarning;

/*
 * I'm using FindBugs. 1.2.1 it's giving
 * "Impossible cast, actual type String[], expected String"
 * warning from line 100. I think it shouldn't. (code is not nice but error is false)
 */
class Bug1816258a {

  @NoWarning("BC_IMPOSSIBLE_CAST")
  public void castTest() {
    Object postObject = new String[] {null};
    String postValue =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject // line
        // 12
        ;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This block is unreachable");
    }

    System.out.println(postValue);
  }

  private boolean getCondition() {
    // Always returns false to ensure the else block is theoretically unreachable
    return false;
  }

  public static void main(String[] args) {
    Bug1816258a gt = new Bug1816258a();
    gt.castTest();
  }
}