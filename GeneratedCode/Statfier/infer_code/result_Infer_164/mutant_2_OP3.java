class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block will never be executed because getCondition() should always return false
        System.out.println("This is an unreachable statement");
      }
      return getThis();
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
      return false;
    }
  }
}