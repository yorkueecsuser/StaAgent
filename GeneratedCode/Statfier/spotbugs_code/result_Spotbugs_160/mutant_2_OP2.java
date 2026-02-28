import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug2387290 {
  public static void method1(Object obj) {

    byte[] b = {12, 13, 24, 54};
    obj = b;

    // Original assignment statement
    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Duplicated assignment statement
    if (byte[].class.isInstance(obj)) {
      byte[] valueCopy = (byte[]) obj;
    }
  }

  @NoWarning("BC")
  public static void method2(Object obj) {

    // Original assignment statement
    if (byte[].class.isInstance(obj)) {
      byte[] value = (byte[]) obj;
    }

    // Duplicated assignment statement
    if (byte[].class.isInstance(obj)) {
      byte[] valueCopy = (byte[]) obj;
    }
  }
}