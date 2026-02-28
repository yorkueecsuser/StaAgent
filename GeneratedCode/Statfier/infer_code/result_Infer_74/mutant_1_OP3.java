class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() should always return false
        System.out.println("This is an unreachable statement.");
      }
      return getThis();
    }

    // Method to provide a dynamically determined condition
    private boolean getCondition() {
      return false;
    }
  }
}