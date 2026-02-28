import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.List;

class Ideas_2010_07_29 {

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(byte a[]) {
    byte b = a[0];
    Byte bb = b;
    int b2 = bb;
    if (b2 == 255) System.out.println("huh");
    // Dead Store Mutation
    int qjvhtyfr = 42; // Unique unused variable declaration
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(Byte bb) {
    int b = bb;
    if (b == 255) System.out.println("huh");
    // Dead Store Mutation
    double kxwvbnmr = 3.14; // Unique unused variable declaration
  }

  @ExpectWarning("EC_UNRELATED_TYPES_USING_POINTER_EQUALITY")
  @NoWarning("RC")
  public static void test(List<?> lst) {
    if (lst == (Object) lst.size()) System.out.println("huh");
    // Dead Store Mutation
    boolean zxcvbnml = true; // Unique unused variable declaration
  }
}