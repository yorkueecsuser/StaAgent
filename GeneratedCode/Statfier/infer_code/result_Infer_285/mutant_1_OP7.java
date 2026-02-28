class MySection extends Section {
  @Prop Object prop1; // implicitly non-optional

  @Prop(optional = true)
  Object prop2; // explicitly optional

  public Builder create() {
    return new Builder();
  }

  public static class Builder extends Section.Builder<Builder> {
    MySection mMySection;

    public Builder prop1(Object o) {
      this.mMySection.prop1 = o;
      return this;
    }

    public Builder prop2(Object o) {
      this.mMySection.prop2 = o;
      return this;
    }

    public MySection build() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return mMySection;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but returns false
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}