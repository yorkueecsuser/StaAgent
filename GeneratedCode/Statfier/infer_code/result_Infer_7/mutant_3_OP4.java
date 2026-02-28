class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() is assumed to return false
      builder = null;
    } else {
      // This block will always execute
      builder = builder;
    }
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        return this;
      }
      // Introduced an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because getCondition() is assumed to return false
        child = null;
      } else {
        // This block will always execute
        child = child;
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        return this;
      }
      // Introduced an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because getCondition() is assumed to return false
        child = null;
      } else {
        // This block will always execute
        child = child;
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

  // Method to provide a dynamic condition that is assumed to return false
  private static boolean getCondition() {
    return false;
  }
}