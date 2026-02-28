class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable for loop based on the mutation operator
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() should return false
        System.out.println("This loop is unreachable");
      }
      return getThis();
    }

    // Method to provide a dynamic condition that will be false
    private boolean getCondition() {
      return false;
    }
  }
}