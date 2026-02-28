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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        this.mVarArgPropComponent.props.clear();
      } else {
        // This block will always execute
        this.mVarArgPropComponent.props.add(new Object());
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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        this.mVarArgPropComponent.props.clear();
      } else {
        // This block will always execute
        this.mVarArgPropComponent.props.add(new Object());
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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        this.mVarArgPropComponent.props.clear();
      } else {
        // This block will always execute
        this.mVarArgPropComponent.props.add(new Object());
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
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        this.mVarArgPropComponent.props.clear();
      } else {
        // This block will always execute
        this.mVarArgPropComponent.props.add(new Object());
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

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
      return false;
    }
  }
}