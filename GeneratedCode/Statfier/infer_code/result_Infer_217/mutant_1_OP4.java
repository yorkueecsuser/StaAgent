class MyComponent extends Component {
  @Prop Object prop1; // implicitly non-optional

  @Prop(optional = true)
  Object prop2; // explicitly optional

  @Prop(optional = false)
  Object prop3; // explicitly non-optional

  Object nonProp;

  public static Builder create() {
    return new Builder();
  }

  public static class Builder extends Component.Builder<Builder> {
    MyComponent mMyComponent;

    public Builder prop1(Object o) {
      this.mMyComponent.prop1 = o;
      return this;
    }

    public Builder prop2(Object o) {
      this.mMyComponent.prop2 = o;
      return this;
    }

    public Builder prop3(Object o) {
      this.mMyComponent.prop3 = o;
      return this;
    }

    public MyComponent build() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable if-else branch
        System.out.println("This is an unreachable else block.");
      }
      return mMyComponent;
    }

    private boolean getCondition() {
      return true; // This ensures the if block runs and else block is unreachable
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}