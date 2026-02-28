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

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(Byte bb) {
    int b = bb;
    if (b == 255) System.out.println("huh");

    // Inserting unreachable while loop
    boolean conditionWhile = getAnotherCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  @ExpectWarning("EC_UNRELATED_TYPES_USING_POINTER_EQUALITY")
  @NoWarning("RC")
  public static void test(List<?> lst) {
    if (lst == (Object) lst.size()) System.out.println("huh");

    // Inserting unreachable while loop
    boolean conditionWhile = yetAnotherCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamically determined condition that is always false
  private static boolean getAnotherCondition() {
    return false;
  }

  // Yet another method to provide a dynamically determined condition that is always false
  private static boolean yetAnotherCondition() {
    return false;
  }
}