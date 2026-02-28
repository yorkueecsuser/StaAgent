import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();
    Utils u2 = new Utils(); // Duplicate assignment statement

    int count = Utils.getMaxTimes();
    int count2 = Utils.getMaxTimes(); // Duplicate assignment statement

    while (count-- > 0) {
      System.out.println(Utils.getGreeting());
    }
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
  public static TypeSafeEnum ONE2 = new TypeSafeEnum(); // Duplicate assignment statement

  public static TypeSafeEnum TWO = new TypeSafeEnum();
  public static TypeSafeEnum TWO2 = new TypeSafeEnum(); // Duplicate assignment statement

  private TypeSafeEnum() {}
}