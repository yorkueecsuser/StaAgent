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
        // This case is intentionally left blank to ensure the switch is unreachable
        break;
    }
    return mMySection.create().prop1(new Object()).build();
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left blank to ensure the switch is unreachable
        break;
    }
    return mMySection.create().prop2(new Object()).build();
  }

  private boolean getCondition() {
    return false;
  }
}