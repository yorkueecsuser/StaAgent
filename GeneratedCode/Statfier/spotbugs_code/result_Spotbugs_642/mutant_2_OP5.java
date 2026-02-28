class Ideas_2011_12_15 extends java.util.Date {

  // @NoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String args[]) {
    Ideas_2011_12_15 t = new Ideas_2011_12_15();
    System.out.printf("%tc%n", t);
    System.out.printf("%Tc%n", t);

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}