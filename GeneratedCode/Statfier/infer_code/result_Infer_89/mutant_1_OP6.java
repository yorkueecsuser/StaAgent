class MyLithoComponent extends Component {
  @Prop Object prop1; // implicitly non-optional

  @Prop(optional = false)
  Object prop2; // explicitly non-optional

  public Builder create() {
    return new Builder();
  }

  public static class Builder extends Component.Builder<Builder> {
    MyLithoComponent mMyLithoComponent;

    public Builder prop1(Object o) {
      this.mMyLithoComponent.prop1 = o;
      return this;
    }

    public Builder prop2(Object o) {
      this.mMyLithoComponent.prop2 = o;
      return this;
    }

    public MyLithoComponent build() {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // Mutant code: This loop will never execute because conditionFor is always false
      }
      return mMyLithoComponent;
    }

    private boolean getCondition() {
      return false; // This method returns false, making the loop condition always false
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}