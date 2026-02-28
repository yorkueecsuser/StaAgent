class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will execute if shouldRun is true
        System.out.println("This block is reachable.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This block is unreachable.");
      }

      return getThis();
    }

    // Method to simulate a dynamic condition that always returns false
    private boolean getCondition() {
      return false;
    }
  }
}