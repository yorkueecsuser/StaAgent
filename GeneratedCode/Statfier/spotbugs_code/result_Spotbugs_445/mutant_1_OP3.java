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
      // Mutant: Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
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

  static class B extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getConditionB();
      if (condition) {
        System.out.println("This is an unreachable statement in B");
      }
      return EqualsBuilder.reflectionEquals(this, obj);
    }

    private boolean getConditionB() {
      return false;
    }
  }

  static class C extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getConditionC();
      if (condition) {
        System.out.println("This is an unreachable statement in C");
      }
      return EqualsBuilder.reflectionEquals(this, obj, new String[] {"x", "y"});
    }

    private boolean getConditionC() {
      return false;
    }
  }

  static class D extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getConditionD();
      if (condition) {
        System.out.println("This is an unreachable statement in D");
      }
      return EqualsBuilder.reflectionEquals(this, obj, Arrays.asList(new String[] {"x", "y"}));
    }

    private boolean getConditionD() {
      return false;
    }
  }

  static class E extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getConditionE();
      if (condition) {
        System.out.println("This is an unreachable statement in E");
      }
      return EqualsBuilder.reflectionEquals(this, obj, false);
    }

    private boolean getConditionE() {
      return false;
    }
  }

  static class F extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getConditionF();
      if (condition) {
        System.out.println("This is an unreachable statement in F");
      }
      return EqualsBuilder.reflectionEquals(this, obj, false, Bug3538042.class);
    }

    private boolean getConditionF() {
      return false;
    }
  }

  static class G extends Bug3538042 {

    @NoWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object obj) {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getConditionG();
      if (condition) {
        System.out.println("This is an unreachable statement in G");
      }
      return EqualsBuilder.reflectionEquals(
          this, obj, false, Bug3538042.class, new String[] {"x", "y"});
    }

    private boolean getConditionG() {
      return false;
    }
  }
}