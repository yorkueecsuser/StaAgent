class RequiredPropsSection {

  public MySection mMySection;

  public Section buildWithAllOk() {
    return mMySection.create().prop1(new Object()).prop2(new Object()).build();
    
    // Introduced unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // prop 2 is optional
  public Section buildWithout2Ok() {
    return mMySection.create().prop1(new Object()).build();
    
    // Introduced unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // prop 1 is required
  public Section buildWithout1Bad() {
    return mMySection.create().prop2(new Object()).build();
    
    // Introduced unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // Method to provide a dynamic condition for the for loop
  private boolean getConditionForLoop() {
    return false;
  }
}