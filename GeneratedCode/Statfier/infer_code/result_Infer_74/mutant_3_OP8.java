class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      return getThis();
    }

    // Mutated code
    public T a(Object b) {
      return getThis();
    }
  }
}