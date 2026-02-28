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
        // This case is unreachable because condition is never true
        builder = null;
        break;
    }
    return builder;
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
          // This case is unreachable because condition is never true
          child = null;
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
          // This case is unreachable because condition is never true
          child = null;
          break;
      }
      return child(child.build());
    }

    Column mColumn;

    @Override
    public Column build() {
      return mColumn;
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}