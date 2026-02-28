import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.FindUnrelatedTypesInGenericContainer;
import java.util.ArrayList;

@DetectorUnderTest(FindUnrelatedTypesInGenericContainer.class)
class Ideas_2012_11_19 {

  static class A<XYZ> extends ArrayList<Long> {
    private static final long serialVersionUID = 1L;
  }

  static class B<XYZ extends Number> extends ArrayList<XYZ> {
    private static final long serialVersionUID = 1L;
  }

  static A<String> foo = new A<String>();

  static B<Long> bar = new B<Long>();

  @NoWarning("GC_UNRELATED_TYPES")
  public static void OK(String args[]) {
    foo.add(13L);
    System.out.println(foo.contains(13L));
    bar.add(13L);
    System.out.println(bar.contains(13L));

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
      case 1:
        System.out.println("This is reachable");
        break;
    }
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad1(String args[]) {
    System.out.println(foo.contains("13"));

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
      case 1:
        System.out.println("This is reachable");
        break;
    }
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad2(String args[]) {
    System.out.println(bar.contains("13"));

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
      case 1:
        System.out.println("This is reachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}