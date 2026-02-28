/**
 * using @Prop(resType =..) allows you to set the Prop with any of.propname,.propnameRes, or
 *.propnameAttr
 */
class ResPropComponent extends Component {

  @Prop(resType = ResType.SOME)
  Object prop; // implicitly non-optional with resType

  public Builder create() {
    return new Builder();
  }

  public static class Builder extends Component.Builder<Builder> {

    ResPropComponent mResPropComponent;

    public Builder prop(Object o) {
      this.mResPropComponent.prop = o;
      return this;
    }

    public Builder propRes(Object o) {
      this.mResPropComponent.prop = o;
      return this;
    }

    public Builder propAttr(Object o) {
      this.mResPropComponent.prop = o;
      return this;
    }

    public Builder propDip(Object o) {
      this.mResPropComponent.prop = o;
      return this;
    }

    public Builder propPx(Object o) {
      this.mResPropComponent.prop = o;
      return this;
    }

    public Builder propSp(Object o) {
      this.mResPropComponent.prop = o;
      return this;
    }

    public ResPropComponent build() {
      return mResPropComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Mutated code
    private ResPropComponent x;

    public Builder a(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder b(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder c(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder d(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder e(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder f(Object o) {
      this.x.prop = o;
      return this;
    }

    public ResPropComponent g() {
      return x;
    }

    @Override
    public Builder h() {
      return this;
    }
  }
}