import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();

    int count = Utils.getMaxTimes();

    // Inserting an unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This will never be printed");
    }

    while (count-- > 0) {
      System.out.println(Utils.getGreeting());
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}

class Utils {
  public static String getGreeting() {
    return "Hello";
  }

  public static int getMaxTimes() {
    return 3;
  }
}

class TypeSafeEnum {
  public static TypeSafeEnum ONE = new TypeSafeEnum();

  public static TypeSafeEnum TWO = new TypeSafeEnum();

  private TypeSafeEnum() {}
}