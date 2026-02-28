import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.List;

class Ideas_2010_07_29 {

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(byte a[]) {
    byte x = a[0]; // Renamed 'b' to 'x'
    Byte xx = x;   // Renamed 'bb' to 'xx'
    int x2 = xx;   // Renamed 'b2' to 'x2'
    if (x2 == 255) System.out.println("huh");
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(Byte bb) {
    int y = bb;    // Renamed 'b' to 'y'
    if (y == 255) System.out.println("huh");
  }

  @ExpectWarning("EC_UNRELATED_TYPES_USING_POINTER_EQUALITY")
  @NoWarning("RC")
  public static void test(List<?> lst) {
    if (lst == (Object) lst.size()) System.out.println("huh");
  }
}