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
      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        this.mMyTreeComponent.nonProp = "Unreachable Code";
      } else {
        // This block will always execute
        this.mMyTreeComponent.nonProp = "Reachable Code";
      }
      return this;
    }

    public MyTreeComponent build() {
      return mMyTreeComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      // Always returns false to ensure the if block is unreachable
      return false;
    }
  }
}