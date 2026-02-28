import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;
    obj = b; // Mutant: duplicated assignment

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
      byte[] value2 = (byte[]) obj; // Mutant: duplicated assignment
    }
  }
}