import java.util.ArrayList;
import java.util.List;

/** varArg test */
class VarArgPropComponent extends Component {

  @Prop(varArg = "prop")
  List<Object> props;

  public Builder create() {
    return new Builder();
  }

  static class Builder extends Component.Builder<Builder> {

    VarArgPropComponent mVarArgPropComponent;

    public Builder prop(Object prop) {
      if (prop == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null) {
        this.mVarArgPropComponent.props = new ArrayList<Object>();
      }
      this.mVarArgPropComponent.props.add(prop);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code.");
      }
      return this;
    }

    public Builder propAttr(Object prop) {
      if (prop == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null) {
        this.mVarArgPropComponent.props = new ArrayList<Object>();
      }
      this.mVarArgPropComponent.props.add(prop);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code.");
      }
      return this;
    }

    public Builder propsAttr(List<Object> props) {
      if (props == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null || this.mVarArgPropComponent.props.isEmpty()) {
        this.mVarArgPropComponent.props = props;
      } else {
        this.mVarArgPropComponent.props.addAll(props);
      }
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code.");
      }
      return this;
    }

    public Builder props(List<Object> props) {
      if (props == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null || this.mVarArgPropComponent.props.isEmpty()) {
        this.mVarArgPropComponent.props = props;
      } else {
        this.mVarArgPropComponent.props.addAll(props);
      }
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code.");
      }
      return this;
    }

    public VarArgPropComponent build() {
      return mVarArgPropComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if-else branches unreachable
    }
  }
}