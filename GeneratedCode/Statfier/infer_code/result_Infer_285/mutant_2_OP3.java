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
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
      return this;
    }

    public Builder prop2(Object o) {
      this.mMySection.prop2 = o;
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is another unreachable statement");
      }
      return this;
    }

    public MySection build() {
      return mMySection;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}