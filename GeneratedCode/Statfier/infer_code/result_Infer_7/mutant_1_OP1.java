class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    String jxqfzvbn = "unused"; // Dead store mutation
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        int vbnrjxqf = 0; // Dead store mutation
        return this;
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
      boolean qfvbnrjx = false; // Dead store mutation
      return mColumn;
    }

    @Override
    public Builder getThis() {
      double rjxqvbnf = 1.0; // Dead store mutation
      return this;
    }
  }
}