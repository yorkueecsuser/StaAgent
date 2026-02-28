class UselessFinalize {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}