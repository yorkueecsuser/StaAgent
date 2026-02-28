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
  static A<String> x = new A<String>(); // Mutant: Renamed 'foo' to 'x'

  static B<Long> bar = new B<Long>();
  static B<Long> y = new B<Long>(); // Mutant: Renamed 'bar' to 'y'

  @NoWarning("GC_UNRELATED_TYPES")
  public static void OK(String args[]) {
    foo.add(13L);
    System.out.println(foo.contains(13L));
    bar.add(13L);
    System.out.println(bar.contains(13L));
  }

  @NoWarning("GC_UNRELATED_TYPES")
  public static void okMutant(String args[]) { // Mutant: Renamed 'OK' to 'okMutant'
    x.add(13L); // Using renamed variable 'x'
    System.out.println(x.contains(13L));
    y.add(13L); // Using renamed variable 'y'
    System.out.println(y.contains(13L));
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad1(String args[]) {
    System.out.println(foo.contains("13"));
  }

  @DesireWarning("GC_UNRELATED_TYPES")
  public static void bad1Mutant(String args[]) { // Mutant: Renamed 'bad1' to 'bad1Mutant'
    System.out.println(x.contains("13")); // Using renamed variable 'x'
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad2(String args[]) {
    System.out.println(bar.contains("13"));
  }

  @ExpectWarning("GC_UNRELATED_TYPES")
  public static void bad2Mutant(String args[]) { // Mutant: Renamed 'bad2' to 'bad2Mutant'
    System.out.println(y.contains("13")); // Using renamed variable 'y'
  }
}