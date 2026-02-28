class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // Some code that will never be executed
        System.out.println("This is unreachable code.");
      } else {
        // Alternative code that will also never be executed
        System.out.println("This is also unreachable code.");
      }
      return getThis();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false; // This method always returns false, ensuring the if-else is unreachable
    }
  }
}