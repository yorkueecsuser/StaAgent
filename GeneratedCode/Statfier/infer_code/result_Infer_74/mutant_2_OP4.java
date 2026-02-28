class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Code that will run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
        System.out.println("This is an unreachable else block.");
      }
      return getThis();
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
      return false;
    }
  }
}