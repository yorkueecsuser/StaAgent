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

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      // This branch is unreachable because getCondition() will always return true
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(Byte bb) {
    int b = bb;
    if (b == 255) System.out.println("huh");

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      // This branch is unreachable because getCondition() will always return true
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("EC_UNRELATED_TYPES_USING_POINTER_EQUALITY")
  @NoWarning("RC")
  public static void test(List<?> lst) {
    if (lst == (Object) lst.size()) System.out.println("huh");

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      // This branch is unreachable because getCondition() will always return true
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition that always returns true
  private static boolean getCondition() {
    return true;
  }
}