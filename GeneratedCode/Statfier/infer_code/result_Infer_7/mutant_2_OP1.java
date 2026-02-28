class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    String qwejrtyp; // Dead store
    return builder;
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        int vbnmkiuh; // Dead store
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
      double xcvbnmlo; // Dead store
      return mColumn;
    }

    @Override
    public Builder getThis() {
      char zxcvbnmq; // Dead store
      return this;
    }
  }
}