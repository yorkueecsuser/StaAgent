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
  static A<String> z = new A<String>(); // Renamed variable

  static B<Long> bar = new B<Long>();
  static B<Long> y = new B<Long>(); // Renamed variable

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

  @NoWarning("GC_UNRELATED_TYPES")
  public static void OKMutant(String args[]) {
    z.add(13L); // Using renamed variable
    System.out.println(z.contains(13L));
    y.add(13L); // Using renamed variable
    System.out.println(y.contains(13L));
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad1Mutant(String args[]) {
    System.out.println(z.contains("13")); // Using renamed variable
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad2Mutant(String args[]) {
    System.out.println(y.contains("13")); // Using renamed variable
  }
}