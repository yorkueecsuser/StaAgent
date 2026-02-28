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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block");
      } else {
        // This block will always execute
        System.out.println("This is the reachable else block");
      }
      return mMySection;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
    }
  }
}