class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
    
    return (o instanceof Long)? (Long) o : null;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and will never return true
    return false;
  }
}