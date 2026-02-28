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
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return new EqualsBuilder()
         .appendSuper(super.equals(obj))
         .append(x, rhs.x)
         .append(y, rhs.y)
         .append(z, rhs.z)
         .isEquals();
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class B extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return EqualsBuilder.reflectionEquals(this, obj);
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class C extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"x", "y"});
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class D extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"x", "y"}));
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class E extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return EqualsBuilder.reflectionEquals(this, obj, false);
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class F extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return EqualsBuilder.reflectionEquals(this, obj, false, Bug2922917.class);
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class G extends Bug2922917 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      boolean condition = getCondition();
      switch(condition) {
        case false:
          // Unreachable code
          System.out.println("This is an unreachable switch case");
          break;
      }
      return EqualsBuilder.reflectionEquals(
          this, obj, false, Bug2922917.class, new String[] {"x", "y"});
    }

    private boolean getCondition() {
      return false;
    }
  }
}