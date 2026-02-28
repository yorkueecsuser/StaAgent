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
      return this;
    }

    public VarArgPropComponent build() {
      return mVarArgPropComponent;
    }

    @Override
    public Builder getThis() {
      return this;
    }

    // Mutated code
    public Builder z(Object z) {
      if (z == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null) {
        this.mVarArgPropComponent.props = new ArrayList<Object>();
      }
      this.mVarArgPropComponent.props.add(z);
      return this;
    }

    public Builder zAttr(Object z) {
      if (z == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null) {
        this.mVarArgPropComponent.props = new ArrayList<Object>();
      }
      this.mVarArgPropComponent.props.add(z);
      return this;
    }

    public Builder zsAttr(List<Object> zs) {
      if (zs == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null || this.mVarArgPropComponent.props.isEmpty()) {
        this.mVarArgPropComponent.props = zs;
      } else {
        this.mVarArgPropComponent.props.addAll(zs);
      }
      return this;
    }

    public Builder zs(List<Object> zs) {
      if (zs == null) {
        return this;
      }
      if (this.mVarArgPropComponent.props == null || this.mVarArgPropComponent.props.isEmpty()) {
        this.mVarArgPropComponent.props = zs;
      } else {
        this.mVarArgPropComponent.props.addAll(zs);
      }
      return this;
    }
  }
}