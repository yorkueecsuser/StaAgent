/**
 * using @Prop(resType =..) allows you to set the Prop with any of.propname,.propnameRes, or
 *.propnameAttr
 */
class ResPropDoubleComponent extends Component {

  @Prop(resType = ResType.SOME)
  Object prop; // implicitly non-optional with resType

  @Prop
  Integer
      propPx; // note that setter for propPx(Integer) is not same as propPx(Object) corresponding to
  // prop

  public Builder create() {
    return new Builder();
  }

  public static class Builder extends Component.Builder<Builder> {

    ResPropDoubleComponent mResPropDoubleComponent;

    public Builder prop(Object o) {
      this.mResPropDoubleComponent.prop = o;
      return this;
    }

    public Builder propPx(Integer o) {
      this.mResPropDoubleComponent.propPx = o;
      return this;
    }

    public Builder propPx(Object o) {
      this.mResPropDoubleComponent.prop = o;
      return this;
    }

    public ResPropDoubleComponent build() {
      return mResPropDoubleComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Mutated code
    private ResPropDoubleComponent a;

    public Builder a(Object o) {
      this.a.prop = o;
      return this;
    }

    public Builder b(Integer o) {
      this.a.propPx = o;
      return this;
    }

    public Builder c(Object o) {
      this.a.prop = o;
      return this;
    }

    public ResPropDoubleComponent d() {
      return a;
    }

    @Override
    public Builder e() {
      return this;
    }
  }
}