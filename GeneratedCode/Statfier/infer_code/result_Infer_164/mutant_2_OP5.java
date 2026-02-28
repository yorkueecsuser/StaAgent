class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      return getThis();
    }

    // Introduced unreachable switch statement
    private boolean getUnreachableCondition() {
      return false;
    }

    public void someMethod() {
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          System.out.println("This is unreachable code");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}