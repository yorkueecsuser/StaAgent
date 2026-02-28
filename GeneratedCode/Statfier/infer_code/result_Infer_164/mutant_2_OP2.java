class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      return getThis(); // Original return statement
      return getThis(); // Duplicated return statement
    }
  }
}