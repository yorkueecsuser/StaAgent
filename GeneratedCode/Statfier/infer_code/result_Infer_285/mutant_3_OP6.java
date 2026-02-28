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
      // Inserting an unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
      return mMySection;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getConditionForLoop() {
      // This method ensures the condition is dynamically determined at runtime
      return false;
    }
  }
}