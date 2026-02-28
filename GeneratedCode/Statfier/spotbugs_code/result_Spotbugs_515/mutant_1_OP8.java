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
    
    // Mutant: Renaming 'o' to 'a'
    Object a = o;
    if (a instanceof String) {
      if (a == null) System.out.println("This check is redundant");
      return;
    }
    System.out.println(a.hashCode());
  }

  @NoWarning("NP")
  public static void doNotReport(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      System.out.println(o.hashCode());
    }
    
    // Mutant: Renaming 'o' to 'b'
    Object b = o;
    if (b instanceof String || b instanceof StringBuffer) {
      System.out.println(b.hashCode());
    }
  }

  @DesireWarning("RCN")
  public static void test2(Object o) {
    if (o instanceof String || o instanceof StringBuffer) {
      if (o == null) System.out.println("Huh?");
    }
    
    // Mutant: Renaming 'o' to 'c'
    Object c = o;
    if (c instanceof String || c instanceof StringBuffer) {
      if (c == null) System.out.println("Huh?");
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
    
    // Mutant: Renaming 'o' to 'd'
    Object d = null;
    if (d instanceof String) {
      System.out.println(d.hashCode());
    } else {
      System.out.println(d.hashCode());
    }
  }
}