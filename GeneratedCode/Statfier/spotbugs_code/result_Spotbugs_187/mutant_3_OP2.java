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
  static A<String> foo_duplicate = new A<String>(); // Duplicate of foo

  static B<Long> bar = new B<Long>();
  static B<Long> bar_duplicate = new B<Long>(); // Duplicate of bar

  @NoWarning("GC_UNRELATED_TYPES")
  public static void OK(String args[]) {
    foo.add(13L);
    foo.add(13L); // Duplicate of the previous line
    System.out.println(foo.contains(13L));
    bar.add(13L);
    bar.add(13L); // Duplicate of the previous line
    System.out.println(bar.contains(13L));
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad1(String args[]) {
    System.out.println(foo.contains("13"));
    System.out.println(foo.contains("13")); // Duplicate of the previous line
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad2(String args[]) {
    System.out.println(bar.contains("13"));
    System.out.println(bar.contains("13")); // Duplicate of the previous line
  }
}