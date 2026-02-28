class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Dead store mutation
      String jxqzbnvt = "unusedVariable";
      return getThis();
    }
  }
}