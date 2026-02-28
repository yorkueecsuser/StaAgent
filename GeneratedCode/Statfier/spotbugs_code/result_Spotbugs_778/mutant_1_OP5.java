import edu.umd.cs.findbugs.annotations.ExpectWarning;

class CreateStaticObject {

  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public void test() {
    Utils u = new Utils();

    int count = Utils.getMaxTimes();

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }

    while (count-- > 0) {
      System.out.println(Utils.getGreeting());
    }
  }

  private boolean getAlwaysFalse() {
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