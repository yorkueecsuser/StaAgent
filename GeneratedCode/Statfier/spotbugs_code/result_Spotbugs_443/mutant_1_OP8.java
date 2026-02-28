import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import org.apache.commons.lang.builder.EqualsBuilder;

class Bug2922917 {
  int x, y, z;

  @Override
  public int hashCode() {
    return x + y + z;
  }

  static class A extends Bug2922917 {

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

  static class B extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj);
    }
  }

  static class C extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"x", "y"});
    }
  }

  static class D extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"x", "y"}));
    }
  }

  static class E extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, false);
    }
  }

  static class F extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(this, obj, false, Bug2922917.class);
    }
  }

  static class G extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      return EqualsBuilder.reflectionEquals(
          this, obj, false, Bug2922917.class, new String[] {"x", "y"});
    }
  }

  // Mutated class H with renamed variable 'x' to 'a'
  static class H extends Bug2922917 {
    int a, y, z;

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
         .append(y, rhs.y)
         .append(z, rhs.z)
         .isEquals();
    }
  }

  // Mutated class I with renamed variable 'y' to 'b'
  static class I extends Bug2922917 {
    int x, b, z;

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
      I rhs = (I) obj;
      return new EqualsBuilder()
         .appendSuper(super.equals(obj))
         .append(x, rhs.x)
         .append(b, rhs.b)
         .append(z, rhs.z)
         .isEquals();
    }
  }

  // Mutated class J with renamed variable 'z' to 'c'
  static class J extends Bug2922917 {
    int x, y, c;

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
      J rhs = (J) obj;
      return new EqualsBuilder()
         .appendSuper(super.equals(obj))
         .append(x, rhs.x)
         .append(y, rhs.y)
         .append(c, rhs.c)
         .isEquals();
    }
  }
}