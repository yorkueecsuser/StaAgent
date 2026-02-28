import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getValue method.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in getValue method.");
    }
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in returnAValue method.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in returnAValue method.");
    }
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in returnAnotherValue method.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in returnAnotherValue method.");
    }
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in testNoError method.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in testNoError method.");
    }
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in testWithError method.");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code in testWithError method.");
    }
    return i.getValue();
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}