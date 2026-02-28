class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        builder = new Builder();
        break;
    }
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        return this;
      }
      // Introduced an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          this.child = child;
          break;
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        return this;
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

  // Helper method to simulate a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}