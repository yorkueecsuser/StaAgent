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

    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code");
    } else {
      // This block is unreachable because getCondition() always returns true
      System.out.println("This is unreachable code");
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(Byte bb) {
    int b = bb;
    if (b == 255) System.out.println("huh");

    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code");
    } else {
      // This block is unreachable because getCondition() always returns true
      System.out.println("This is unreachable code");
    }
  }

  @ExpectWarning("EC_UNRELATED_TYPES_USING_POINTER_EQUALITY")
  @NoWarning("RC")
  public static void test(List<?> lst) {
    if (lst == (Object) lst.size()) System.out.println("huh");

    // Mutant: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code");
    } else {
      // This block is unreachable because getCondition() always returns true
      System.out.println("This is unreachable code");
    }
  }

  // Method to provide a dynamic condition that always returns true
  private static boolean getCondition() {
    return true;
  }
}