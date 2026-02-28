class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is an unreachable block due to the condition always being false at runtime
      mMySection.create().prop1(new Object()).prop2(new Object()).build();
    } else {
      // This is the actual path taken
      return mMySection.create().prop1(new Object()).prop2(new Object()).build();
    }
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is an unreachable block due to the condition always being false at runtime
      mMySection.create().prop1(new Object()).build();
    } else {
      // This is the actual path taken
      return mMySection.create().prop1(new Object()).build();
    }
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is an unreachable block due to the condition always being false at runtime
      mMySection.create().prop2(new Object()).build();
    } else {
      // This is the actual path taken
      return mMySection.create().prop2(new Object()).build();
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}