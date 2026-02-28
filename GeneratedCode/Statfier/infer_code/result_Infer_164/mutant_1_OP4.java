class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will execute if shouldRun is true
      } else {
        // This block is unreachable because shouldRun is never set to false in this context
      }
      return getThis();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }
}