import edu.umd.cs.findbugs.annotations.NoWarning;

/*
 * I'm using FindBugs. 1.2.1 it's giving
 * "Impossible cast, actual type String[], expected String"
 * warning from line 100. I think it shouldn't. (code is not nice but error is false)
 */
class Bug1816258 {

  @NoWarning("BC_IMPOSSIBLE_CAST")
  public void castTest() {
    Object postObject = new String[] {null};
    String postValue =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject // line
        // 12
        ;
    System.out.println(postValue);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement in castTest.");
    }
  }

  @NoWarning("BC_IMPOSSIBLE_CAST")
  public void castTest2() {
    Object postObject = new String[] {null};

    String postValue;
    if (postObject instanceof String[]) postValue = ((String[]) postObject)[0];
    else postValue = (String) postObject; // line 12
    System.out.println(postValue);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement in castTest2.");
    }
  }

  public void castTest3(Object postObject) {
    String postValue =
        postObject instanceof String[]? ((String[]) postObject)[0] : (String) postObject // line
        // 12
        ;
    System.out.println(postValue);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement in castTest3.");
    }
  }

  public void castTest4(Object postObject) {

    String postValue;
    if (postObject instanceof String[]) postValue = ((String[]) postObject)[0];
    else postValue = (String) postObject; // line 12
    System.out.println(postValue);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement in castTest4.");
    }
  }

  public static void main(String[] args) {
    Bug1816258 gt = new Bug1816258();
    gt.castTest();
    gt.castTest2();
  }

  // Method to provide a condition that always returns false
  private boolean getCondition() {
    return false;
  }
}