import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();
    Utils v = new Utils(); // Mutant: Added another instance of Utils with a new variable name

    int count = Utils.getMaxTimes();
    int cnt = Utils.getMaxTimes(); // Mutant: Renamed 'count' to 'cnt'

    while (cnt-- > 0) {
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
  public static TypeSafeEnum OME = new TypeSafeEnum(); // Mutant: Renamed 'ONE' to 'OME'

  public static TypeSafeEnum TWO = new TypeSafeEnum();
  public static TypeSafeEnum TUO = new TypeSafeEnum(); // Mutant: Renamed 'TWO' to 'TUO'

  private TypeSafeEnum() {}
}