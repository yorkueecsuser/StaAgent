class Section {

  public abstract static class Builder<T extends Builder<T>> {

    public abstract Section build();

    public abstract T getThis();

    public T commonProp(Object prop) {
      // Introducing an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case");
          break;
        default:
          // Default case
          break;
      }
      return getThis();
    }

    private boolean getCondition() {
      // This method always returns false, ensuring the switch case is unreachable
      return false;
    }
  }
}