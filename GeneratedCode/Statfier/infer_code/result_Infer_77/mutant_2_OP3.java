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
      // Introducing an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable statement.");
      }
      return mMyTreeComponent;
    }

    private boolean getCondition() {
      return false;
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}