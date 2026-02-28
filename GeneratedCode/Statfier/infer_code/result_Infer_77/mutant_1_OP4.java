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
        // This is an unreachable else block due to the condition always being false
        System.out.println("This is an unreachable else block.");
      }
      return mMyTreeComponent;
    }

    private boolean getCondition() {
      // This method should return false to make the else block unreachable
      return false;
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}