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
      // Dead Store Mutation
      String abcdefgh = "abcdefgh";
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
      // Dead Store Mutation
      int hijklmno = 12345678;
      return EqualsBuilder.reflectionEquals(this, obj);
    }
  }

  static class C extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Dead Store Mutation
      boolean pqrstuvw = true;
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"x", "y"});
    }
  }

  static class D extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Dead Store Mutation
      double xyzabcde = 987654321.0;
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"x", "y"}));
    }
  }

  static class E extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Dead Store Mutation
      char fghijklm = 'a';
      return EqualsBuilder.reflectionEquals(this, obj, false);
    }
  }

  static class F extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Dead Store Mutation
      long nopqrstu = 9876543210L;
      return EqualsBuilder.reflectionEquals(this, obj, false, Bug2922917.class);
    }
  }

  static class G extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Dead Store Mutation
      float vwxyzabc = 12345.6789f;
      return EqualsBuilder.reflectionEquals(
          this, obj, false, Bug2922917.class, new String[] {"x", "y"});
    }
  }
}