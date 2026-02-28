import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Mutant code
    byte[] c = {12, 13, 24, 54};
    obj = c;

    if (byte[].class.isInstance(obj)) {
      byte[] x = (byte[]) obj;
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Mutant code
    if (byte[].class.isInstance(obj)) {
      byte[] y = (byte[]) obj;
    }
  }
}