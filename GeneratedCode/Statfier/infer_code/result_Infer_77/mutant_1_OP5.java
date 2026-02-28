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

    // Introduced an unreachable switch statement
    private boolean getUnreachableCondition() {
      return false;
    }

    public void someMethod() {
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This will never be printed");
          break;
        default:
          // Default case is also unreachable due to the same reason
          System.out.println("This will also never be printed");
          break;
      }
    }
  }
}