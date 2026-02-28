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
      // Mutant insertion: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will run if shouldRun is true");
      } else {
        System.out.println("This is unreachable because shouldRun is never set to true");
      }
      return this;
    }

    public Builder prop2(Object o) {
      this.mMyLithoComponent.prop2 = o;
      return this;
    }

    public MyLithoComponent build() {
      return mMyLithoComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Method to provide a dynamic condition that is never true
    private boolean getCondition() {
      return false;
    }
  }
}