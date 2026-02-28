class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introduced an unreachable while loop based on a dynamic condition
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop body is unreachable because getCondition() always returns false
      }
      return getThis();
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
      return false; // This ensures the condition is always false, making the loop unreachable
    }
  }
}