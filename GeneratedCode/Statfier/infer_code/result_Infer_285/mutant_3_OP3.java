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
      return mMySection;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Introduced unreachable if statement with a dynamic condition
    private boolean getUnreachableCondition() {
      return false; // This method will always return false, making the if statement unreachable
    }

    public void someMethod() {
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement.");
      }
    }
  }
}