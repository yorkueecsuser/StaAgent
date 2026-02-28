class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introduced an unreachable while loop with a dynamic condition
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop body is unreachable because getCondition() should always return false
        System.out.println("This is an unreachable loop");
      }
      return getThis();
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
      return false;
    }
  }
}