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
      String abcdefgh = "abcdefgh"; // Dead store
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
      int hijklmno = 12345678; // Dead store
      return EqualsBuilder.reflectionEquals(this, obj);
    }
  }

  static class C extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      double pqrstuvw = 987654321.0; // Dead store
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"x", "y"});
    }
  }

  static class D extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      char xyzabcde = 'a'; // Dead store
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"x", "y"}));
    }
  }

  static class E extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean fghijklm = true; // Dead store
      return EqualsBuilder.reflectionEquals(this, obj, false);
    }
  }

  static class F extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      long nopqrstu = 9876543210L; // Dead store
      return EqualsBuilder.reflectionEquals(this, obj, false, Bug3538042.class);
    }
  }

  static class G extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      float vwxyzabc = 123.456f; // Dead store
      return EqualsBuilder.reflectionEquals(
          this, obj, false, Bug3538042.class, new String[] {"x", "y"});
    }
  }
}