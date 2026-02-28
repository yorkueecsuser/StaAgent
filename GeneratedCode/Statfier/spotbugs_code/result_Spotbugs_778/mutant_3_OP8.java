import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();
    Utils v = new Utils(); // Mutant: Added another instance of Utils

    int count = Utils.getMaxTimes();
    int cnt = Utils.getMaxTimes(); // Mutant: Added another variable with a renamed form of 'count'

    while (count-- > 0) {
      System.out.println(Utils.getGreeting());
    }

    while (cnt-- > 0) { // Mutant: Using the renamed variable in a similar context
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
  public static TypeSafeEnum O = new TypeSafeEnum(); // Mutant: Renamed 'ONE' to 'O'

  public static TypeSafeEnum TWO = new TypeSafeEnum();
  public static TypeSafeEnum T = new TypeSafeEnum(); // Mutant: Renamed 'TWO' to 'T'

  private TypeSafeEnum() {}
}