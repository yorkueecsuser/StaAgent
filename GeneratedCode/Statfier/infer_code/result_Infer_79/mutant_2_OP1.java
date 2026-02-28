class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    String abcdexyz; // Dead store mutation
    return mMySection.create().prop1(new Object()).prop2(new Object()).build();
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    int efghijkl; // Dead store mutation
    return mMySection.create().prop1(new Object()).build();
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    boolean mnopqrst; // Dead store mutation
    return mMySection.create().prop2(new Object()).build();
  }
}