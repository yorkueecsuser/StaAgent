class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() should return false
      }

      return getThis();
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
      return false;
    }
  }
}