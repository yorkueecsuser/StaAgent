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
      // Introducing an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will never return true
      }
      return mMyTreeComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      // This method ensures the condition is dynamically determined at runtime
      return false;
    }
  }
}