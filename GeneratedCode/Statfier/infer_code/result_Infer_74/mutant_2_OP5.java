class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introduced an unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          // This case is unreachable because alwaysFalse is always false
          System.out.println("This is an unreachable case.");
          break;
      }
      return getThis();
    }

    private boolean getAlwaysFalse() {
      return false;
    }
  }
}