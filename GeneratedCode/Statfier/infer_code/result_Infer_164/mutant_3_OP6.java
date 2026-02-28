class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will never return true
      }

      return getThis();
    }

    private boolean getCondition() {
      // This method ensures the condition is dynamically determined at runtime
      return false;
    }
  }
}