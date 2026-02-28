class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() should return false
      }

      return getThis();
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
      return false;
    }
  }
}