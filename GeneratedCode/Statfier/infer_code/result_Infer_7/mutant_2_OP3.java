class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      builder = new Builder(); // This line is unreachable
    }
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        return this;
      }
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        return this; // This line is unreachable
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        return this;
      }
      return child(child.build());
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        return this; // This line is unreachable
      }
    }

    Column mColumn;

    @Override
    public Column build() {
      return mColumn;
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        return new Column(); // This line is unreachable
      }
    }

    @Override
    public Builder getThis() {
      return this;
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        return new Builder(); // This line is unreachable
      }
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}