class MyComponent extends Component {
  @Prop Object prop1; // implicitly non-optional

  @Prop(optional = true)
  Object prop2; // explicitly optional

  @Prop(optional = false)
  Object prop3; // explicitly non-optional

  Object nonProp;

  public static Builder create() {
    return new Builder();
  }

  public static class Builder extends Component.Builder<Builder> {
    MyComponent mMyComponent;

    public Builder prop1(Object o) {
      this.mMyComponent.prop1 = o;
      return this;
    }

    public Builder prop2(Object o) {
      this.mMyComponent.prop2 = o;
      return this;
    }

    public Builder prop3(Object o) {
      this.mMyComponent.prop3 = o;
      return this;
    }

    public MyComponent build() {
      return mMyComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Mutated code
    private MyComponent x;

    public Builder a(Object o) {
      this.x.prop1 = o;
      return this;
    }

    public Builder b(Object o) {
      this.x.prop2 = o;
      return this;
    }

    public Builder c(Object o) {
      this.x.prop3 = o;
      return this;
    }

    public MyComponent d() {
      return x;
    }

    @Override
    public Builder e() {
      return this;
    }
  }
}