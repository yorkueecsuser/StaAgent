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
      // Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable statement.");
      }
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

    private boolean getCondition() {
      // Always returns false to ensure the if statement is unreachable
      return false;
    }
  }
}