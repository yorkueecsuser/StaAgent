class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in buildWithAllOk");
    }
    return mMySection.create().prop1(new Object()).prop2(new Object()).build();
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in buildWithout2Ok");
    }
    return mMySection.create().prop1(new Object()).build();
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in buildWithout1Bad");
    }
    return mMySection.create().prop2(new Object()).build();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}