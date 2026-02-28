class Component {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Component build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          // This case will never be reached because alwaysFalse is always false
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case
          break;
      }
      return getThis();
    }

    private boolean getAlwaysFalse() {
      // This method always returns false, ensuring the switch statement remains unreachable
      return false;
    }
  }
}