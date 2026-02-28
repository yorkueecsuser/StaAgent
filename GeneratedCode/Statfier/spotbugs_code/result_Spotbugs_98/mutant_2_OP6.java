class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    
    // Introduced an unreachable for loop based on the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }

    return (o instanceof Long)? (Long) o : null;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and always returns false
    return false;
  }
}