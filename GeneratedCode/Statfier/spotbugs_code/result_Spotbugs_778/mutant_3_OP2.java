import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();
    Utils u2 = new Utils(); // Mutant: duplicated assignment

    int count = Utils.getMaxTimes();
    int count2 = Utils.getMaxTimes(); // Mutant: duplicated assignment

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
  public static TypeSafeEnum ONE2 = new TypeSafeEnum(); // Mutant: duplicated assignment

  public static TypeSafeEnum TWO = new TypeSafeEnum();
  public static TypeSafeEnum TWO2 = new TypeSafeEnum(); // Mutant: duplicated assignment

  private TypeSafeEnum() {}
}