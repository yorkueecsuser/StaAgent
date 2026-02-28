class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return builder;
  }

  private static boolean getCondition() {
    return false;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        return this;
      }
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        return this;
      }
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
      return child(child.build());
    }

    Column mColumn;

    @Override
    public Column build() {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
      return mColumn;
    }

    @Override
    public Builder getThis() {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
      return this;
    }
  }
}