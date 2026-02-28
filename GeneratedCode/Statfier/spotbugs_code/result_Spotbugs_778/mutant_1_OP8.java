import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();
    Utils v = new Utils(); // Added mutant variable

    int count = Utils.getMaxTimes();
    int cnt = Utils.getMaxTimes(); // Added mutant variable

    while (count-- > 0) {
      System.out.println(Utils.getGreeting());
    }

    while (cnt-- > 0) { // Mutated loop using new variable
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
  public static TypeSafeEnum ONEW = new TypeSafeEnum(); // Added mutant variable

  public static TypeSafeEnum TWO = new TypeSafeEnum();
  public static TypeSafeEnum TWOW = new TypeSafeEnum(); // Added mutant variable

  private TypeSafeEnum() {}
}