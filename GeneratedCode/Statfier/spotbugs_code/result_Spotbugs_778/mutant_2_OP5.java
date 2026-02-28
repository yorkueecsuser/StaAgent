import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();

    int count = Utils.getMaxTimes();

    // Inserting an unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }

    while (count-- > 0) {
      System.out.println(Utils.getGreeting());
    }
  }

  // Method to provide a dynamic condition that is always false
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