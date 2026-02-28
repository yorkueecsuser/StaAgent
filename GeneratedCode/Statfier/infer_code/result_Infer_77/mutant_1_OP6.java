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
      boolean conditionFor = getConditionFor();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and will be false
      }
      return mMyTreeComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getConditionFor() {
      return false; // This method returns false, making the loop condition always false
    }
  }
}