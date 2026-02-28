class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Unreachable for loop inserted here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return builder;
  }

  private static boolean getCondition() {
    return false;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        // Unreachable for loop inserted here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because getCondition() always returns false
        }
        return this;
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        // Unreachable for loop inserted here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because getCondition() always returns false
        }
        return this;
      }
      return child(child.build());
    }

    Column mColumn;

    @Override
    public Column build() {
      // Unreachable for loop inserted here
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() always returns false
      }
      return mColumn;
    }

    @Override
    public Builder getThis() {
      // Unreachable for loop inserted here
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() always returns false
      }
      return this;
    }
  }
}