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
    ResPropComponent x;

    public Builder z(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder y(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder w(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder v(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder u(Object o) {
      this.x.prop = o;
      return this;
    }

    public Builder t(Object o) {
      this.x.prop = o;
      return this;
    }
  }
}