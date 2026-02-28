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
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
      return this;
    }

    public Builder propPx(Integer o) {
      this.mResPropDoubleComponent.propPx = o;
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
      return this;
    }

    public Builder propPx(Object o) {
      this.mResPropDoubleComponent.prop = o;
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
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
      // This method ensures the condition is dynamically determined at runtime and is always false
      return false;
    }
  }
}