class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will run if shouldRun is true
      } else {
        // This branch is unreachable because shouldRun is always false
      }
      return getThis();
    }

    // Method to simulate a condition that is always false
    private boolean getCondition() {
      return false;
    }
  }
}