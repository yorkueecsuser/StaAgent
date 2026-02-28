class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() should return false
      }
      return getThis();
    }

    private boolean getCondition() {
      // This method should return false to ensure the while loop is unreachable
      return false;
    }
  }
}