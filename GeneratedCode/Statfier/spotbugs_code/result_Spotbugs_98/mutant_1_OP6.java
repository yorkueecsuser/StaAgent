class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    
    return (o instanceof Long)? (Long) o : null;
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}