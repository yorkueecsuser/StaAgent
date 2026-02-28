class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Dead Store Mutation
    String jxqfhtop = "unusedVariable";
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        // Dead Store Mutation
        int pqwvbnmr = 42;
        return this;
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        // Dead Store Mutation
        boolean klnjhgfr = true;
        return this;
      }
      return child(child.build());
    }

    Column mColumn;

    @Override
    public Column build() {
      // Dead Store Mutation
      double zxcvbnml = 3.14;
      return mColumn;
    }

    @Override
    public Builder getThis() {
      // Dead Store Mutation
      char asdfghjk = 'a';
      return this;
    }
  }
}