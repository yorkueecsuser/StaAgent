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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  @ExpectWarning("INT_BAD_COMPARISON_WITH_SIGNED_BYTE")
  public static void test(Byte bb) {
    int b = bb;
    if (b == 255) System.out.println("huh");

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  @ExpectWarning("EC_UNRELATED_TYPES_USING_POINTER_EQUALITY")
  @NoWarning("RC")
  public static void test(List<?> lst) {
    if (lst == (Object) lst.size()) System.out.println("huh");

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  private static int getValue(boolean condition) {
    return condition? 1 : 0; // This ensures the switch condition never matches the cases
  }
}