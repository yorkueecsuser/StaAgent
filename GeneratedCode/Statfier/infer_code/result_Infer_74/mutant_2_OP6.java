class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      return getThis();
    }

    // Introduced an unreachable for loop according to the mutation operator
    private boolean getCondition() {
      return false;
    }

    public void someMethod() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    }
  }
}