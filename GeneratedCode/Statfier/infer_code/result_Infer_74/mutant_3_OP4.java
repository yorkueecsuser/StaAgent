class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will run if shouldRun is true
      } else {
        // This branch is unreachable because getCondition() always returns false
      }
      return getThis();
    }

    private boolean getCondition() {
      // This method always returns false, making the else branch unreachable
      return false;
    }
  }
}