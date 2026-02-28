class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Introduced unreachable switch statement
  static void introduceUnreachableSwitch() {
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