class MyTreeComponent extends Component {
  @TreeProp Object prop1; // implicitly non-optional

  Object nonProp;

  public Builder create() {
    return new Builder();
  }

  static class Builder extends Component.Builder<Builder> {
    MyTreeComponent mMyTreeComponent;

    public Builder prop1(Object o) {
      this.mMyTreeComponent.prop1 = o;
      return this;
    }

    public MyTreeComponent build() {
      return mMyTreeComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Inserting an unreachable switch statement
    public void someMethod() {
      boolean condition = getCondition();
      switch (getValue()) {
        case 1:
          if (condition) {
            // Some code
          }
          break;
        default:
          // Default case
          break;
      }
    }

    private boolean getCondition() {
      return false; // This ensures the condition is dynamically determined but always false
    }

    private int getValue() {
      return 0; // This ensures the switch value is dynamically determined but always 0
    }
  }
}