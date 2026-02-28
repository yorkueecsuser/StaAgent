import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import org.apache.commons.lang3.builder.EqualsBuilder;

class Bug3538042 {
  int x, y, z;

  @Override
  public int hashCode() {
    return x + y + z;
  }

  static class A extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }
      if (obj == this) {
        return true;
      }
      if (obj.getClass()!= getClass()) {
        return false;
      }
      A rhs = (A) obj;
      return new EqualsBuilder()
         .appendSuper(super.equals(obj))
         .append(x, rhs.x)
         .append(y, rhs.y)
         .append(z, rhs.z)
         .isEquals();
    }
  }

  static class B extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj);
    }
  }

  static class C extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"x", "y"});
    }
  }

  static class D extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"x", "y"}));
    }
  }

  static class E extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, false);
    }
  }

  static class F extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, false, Bug3538042.class);
    }
  }

  static class G extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(
          this, obj, false, Bug3538042.class, new String[] {"x", "y"});
    }
  }

  // Mutated code with renamed variables
  static class H extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      if (obj == null) {
        return false;
      }
      if (obj == this) {
        return true;
      }
      if (obj.getClass()!= getClass()) {
        return false;
      }
      H rhs = (H) obj;
      return new EqualsBuilder()
         .appendSuper(super.equals(obj))
         .append(a, rhs.a)
         .append(b, rhs.b)
         .append(c, rhs.c)
         .isEquals();
    }
  }

  static class I extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj);
    }
  }

  static class J extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"a", "b"});
    }
  }

  static class K extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"a", "b"}));
    }
  }

  static class L extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, d);
    }
  }

  static class M extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, d, Bug3538042.class);
    }
  }

  static class N extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(
          this, obj, d, Bug3538042.class, new String[] {"a", "b"});
    }
  }
}