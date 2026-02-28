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

    // Mutated variable names
    MyTreeComponent x;
    public Builder a(Object o) {
      this.x.prop1 = o;
      return this;
    }

    public MyTreeComponent b() {
      return x;
    }

    @Override
    public Builder c() {
      return this;
    }
  }
}