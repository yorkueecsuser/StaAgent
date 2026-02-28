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
      boolean condition = getCondition();
      if (condition) {
        // This block is intentionally left empty to make the if statement unreachable
      }
      return mMyTreeComponent;
    }

    private boolean getCondition() {
      return false; // This method returns false, ensuring the if statement is unreachable
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}