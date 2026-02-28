class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return (o instanceof Long)? (Long) o : null;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}