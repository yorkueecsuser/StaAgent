class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      return getThis();
    }

    // Mutant code
    public T x(Object y) {
      return getThis();
    }
  }
}