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

    // Mutated code
    MyTreeComponent a; // Renamed mMyTreeComponent to a

    public Builder x(Object o) { // Renamed prop1 to x
      this.a.prop1 = o;
      return this;
    }

    public MyTreeComponent y() { // Renamed build to y
      return a;
    }

    @Override
    public Builder z() { // Renamed getThis to z
      return this;
    }
  }
}