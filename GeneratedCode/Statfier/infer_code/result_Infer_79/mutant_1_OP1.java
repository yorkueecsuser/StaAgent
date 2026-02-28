class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    String abcdefgh = "unusedVariable"; // Dead Store
    return mMySection.create().prop1(new Object()).prop2(new Object()).build();
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    int ijklmnop = 42; // Dead Store
    return mMySection.create().prop1(new Object()).build();
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean qrstuvwx = true; // Dead Store
    return mMySection.create().prop2(new Object()).build();
  }
}