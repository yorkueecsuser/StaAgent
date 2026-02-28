class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() should return false
      }
      return getThis();
    }

    private boolean getCondition() {
      // This method should return false to make the loop unreachable
      return false;
    }
  }
}