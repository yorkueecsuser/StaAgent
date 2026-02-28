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

    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This will never be printed");
    }

    System.out.println(postValue);
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }

  public static void main(String[] args) {
    Bug1816258a gt = new Bug1816258a();
    gt.castTest();
  }
}