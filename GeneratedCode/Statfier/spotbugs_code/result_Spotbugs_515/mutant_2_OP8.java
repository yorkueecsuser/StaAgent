import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InstanceOf {

  @ExpectWarning("RV,NP")
  @DesireWarning("RCN")
  public static void test(Object o) {
    if (o == null) new IllegalArgumentException("Forgot to throw this");
    if (o instanceof String) {
      if (o == null) System.out.println("This check is redundant");
      return;
    }
    System.out.println(o.hashCode());
    
    // Mutant code
    Object x = o;
    if (x instanceof String) {
      if (x == null) System.out.println("This check is redundant");
      return;
    }
    System.out.println(x.hashCode());
  }

  @NoWarning("NP")
  public static void doNotReport(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      System.out.println(o.hashCode());
    }
    
    // Mutant code
    Object y = o;
    if (y instanceof String || y instanceof StringBuffer) {
      System.out.println(y.hashCode());
    }
  }

  @DesireWarning("RCN")
  public static void test2(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      if (o == null) System.out.println("Huh?");
    }
    
    // Mutant code
    Object z = o;
    if (z instanceof String || z instanceof StringBuffer) {
      if (z == null) System.out.println("Huh?");
    }
  }

  @ExpectWarning("NP,DB")
  public static void test3() {
    Object o = null;
    if (o instanceof String) {
      System.out.println(o.hashCode());
    } else {
      System.out.println(o.hashCode());
    }
    
    // Mutant code
    Object p = o;
    if (p instanceof String) {
      System.out.println(p.hashCode());
    } else {
      System.out.println(p.hashCode());
    }
  }
}