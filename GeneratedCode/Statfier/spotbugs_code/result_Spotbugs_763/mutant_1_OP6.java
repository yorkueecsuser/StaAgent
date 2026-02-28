class CallSystemExit {

  @Override
  public boolean equals(Object o) {
    if (o instanceof CallSystemExit) return true;
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }

    System.exit(1);
    return false;
  }

  private boolean getCondition() {
    // This method returns false, making the for loop unreachable
    return false;
  }
}