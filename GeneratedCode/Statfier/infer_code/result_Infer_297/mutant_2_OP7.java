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
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() returns false
      }
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

    private boolean getCondition() {
      return false;
    }
  }
}