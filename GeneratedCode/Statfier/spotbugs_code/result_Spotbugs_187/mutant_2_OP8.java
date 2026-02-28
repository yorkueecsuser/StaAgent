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
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad1(String args[]) {
    System.out.println(foo.contains("13"));
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad2(String args[]) {
    System.out.println(bar.contains("13"));
  }

  // Mutant code starts here
  static A<String> a = new A<String>();

  static B<Long> b = new B<Long>();

  @NoWarning("GC_UNRELATED_TYPES")
  public static void ok(String args[]) {
    a.add(13L);
    System.out.println(a.contains(13L));
    b.add(13L);
    System.out.println(b.contains(13L));
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad3(String args[]) {
    System.out.println(a.contains("13"));
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad4(String args[]) {
    System.out.println(b.contains("13"));
  }
}