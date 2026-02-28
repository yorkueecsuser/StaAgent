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
      // Inserting unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("This is an unreachable statement");
      }
      return this;
    }

    public Builder prop2(Object o) {
      this.mMyComponent.prop2 = o;
      // Inserting unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("This is another unreachable statement");
      }
      return this;
    }

    public Builder prop3(Object o) {
      this.mMyComponent.prop3 = o;
      // Inserting unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() will always return false
        System.out.println("Yet another unreachable statement");
      }
      return this;
    }

    public MyComponent build() {
      return mMyComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      // This method always returns false, making the if statements unreachable
      return false;
    }
  }
}