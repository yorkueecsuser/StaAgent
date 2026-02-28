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
      // Introduced unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable
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
      // Introduced unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable
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
      // Introduced unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable
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
      // Introduced unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable
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

    private boolean getConditionForLoop() {
      return false; // This ensures the loop is unreachable
    }
  }
}