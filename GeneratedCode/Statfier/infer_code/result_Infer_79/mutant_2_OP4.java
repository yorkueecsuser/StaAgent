class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      mMySection.create().prop1(new Object()).prop2(new Object()).build();
    }
    return mMySection.create().prop1(new Object()).prop2(new Object()).build();
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      mMySection.create().prop1(new Object()).build();
    }
    return mMySection.create().prop1(new Object()).build();
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      mMySection.create().prop2(new Object()).build();
    }
    return mMySection.create().prop2(new Object()).build();
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}