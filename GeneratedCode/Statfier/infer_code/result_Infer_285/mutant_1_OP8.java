class MySection extends Section {
  @Prop Object prop1; // implicitly non-optional

  @Prop(optional = true)
  Object prop2; // explicitly optional

  public Builder create() {
    return new Builder();
  }

  public static class Builder extends Section.Builder<Builder> {
    MySection mMySection;

    public Builder prop1(Object o) {
      this.mMySection.prop1 = o;
      return this;
    }

    public Builder prop2(Object o) {
      this.mMySection.prop2 = o;
      return this;
    }

    public MySection build() {
      return mMySection;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Mutated code
    MySection a;

    public Builder a(Object o) {
      this.a.prop1 = o;
      return this;
    }

    public Builder b(Object o) {
      this.a.prop2 = o;
      return this;
    }

    public MySection c() {
      return a;
    }

    @Override
    public Builder d() {
      return this;
    }
  }
}