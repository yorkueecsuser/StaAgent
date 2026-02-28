class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder = null;
    }
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        return this;
      }
      // Mutant: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        child = null;
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        return this;
      }
      // Mutant: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        child = null;
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

    // Method to provide a dynamic condition for mutants
    private boolean getCondition() {
      return false; // This will always return false, but it's not a compile-time constant
    }
  }
}