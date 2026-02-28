class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      return getThis();
    }

    // Introduced an unreachable switch statement
    private boolean getCondition() {
      return false;
    }

    public void someMethod() {
      boolean condition = getCondition();
      switch (condition) {
        case true:
          System.out.println("This is unreachable");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}