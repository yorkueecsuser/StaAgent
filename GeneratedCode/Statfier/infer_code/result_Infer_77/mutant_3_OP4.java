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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if the condition is true
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch.");
      }
      return mMyTreeComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      // This method should return a condition that is dynamically determined at runtime
      return false; // This is just a placeholder to simulate a dynamic condition
    }
  }
}