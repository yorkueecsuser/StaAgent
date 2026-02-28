class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
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
      return mColumn;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Mutated code
    public Builder x(Component x) {
      if (x == null) {
        return this;
      }
      return this;
    }

    public Builder y(Component.Builder y) {
      if (y == null) {
        return this;
      }
      return child(y.build());
    }

    Column z;

    @Override
    public Column w() {
      return z;
    }

    @Override
    public Builder v() {
      return this;
    }
  }
}