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
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
      return mMyLithoComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      return false;
    }
  }
}