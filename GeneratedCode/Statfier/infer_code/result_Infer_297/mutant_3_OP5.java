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

    // Introduced unreachable switch statement
    private boolean getUnreachableCondition() {
      return false;
    }

    public Builder addUnreachableSwitch() {
      int value = getValue();
      boolean condition = getUnreachableCondition();
      if (condition) {
        switch (value) {
          case 1:
            // Unreachable case
            System.out.println("This is unreachable case 1");
            break;
          case 2:
            // Unreachable case
            System.out.println("This is unreachable case 2");
            break;
          default:
            // Unreachable default
            System.out.println("This is unreachable default");
            break;
        }
      }
      return this;
    }

    private int getValue() {
      return 0;
    }
  }
}