class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    return mMySection.create().prop1(new Object()).prop2(new Object()).build();
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This is an unreachable case");
        break;
    }
    return mMySection.create().prop1(new Object()).build();
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This is an unreachable case");
        break;
    }
    return mMySection.create().prop2(new Object()).build();
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch cases are unreachable
    return false;
  }
}