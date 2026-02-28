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
      return mMyLithoComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Introduced unreachable switch statement
    private boolean getUnreachableCondition() {
      return false;
    }

    public void someMethod() {
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          // This case is unreachable
          System.out.println("This will never be printed");
          break;
        default:
          // Default case is also unreachable due to the nature of the condition
          System.out.println("This will also never be printed");
          break;
      }
    }
  }
}