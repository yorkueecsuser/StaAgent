class MyTreeComponent extends Component {
  @TreeProp Object prop1; // implicitly non-optional

  Object nonProp;

  public Builder create() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Builder();
  }

  static class Builder extends Component.Builder<Builder> {
    MyTreeComponent mMyTreeComponent;

    public Builder prop1(Object o) {
      this.mMyTreeComponent.prop1 = o;
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return this;
    }

    public MyTreeComponent build() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return mMyTreeComponent;
    }

    @Override
    public Builder getThis() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return this;
    }
  }

  private boolean getCondition() {
    return false;
  }
}