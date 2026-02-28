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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code for prop1");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code for prop1");
      }
      return this;
    }

    public Builder prop2(Object o) {
      this.mMyLithoComponent.prop2 = o;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code for prop2");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code for prop2");
      }
      return this;
    }

    public MyLithoComponent build() {
      return mMyLithoComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      // This method should return false at runtime to ensure the branches are unreachable
      return false;
    }
  }
}