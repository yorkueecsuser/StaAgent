// _SHOULD_BE_SKIPPED_

class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  public static void someMethod() {
    String abcdefgh = "unusedVariable"; // Dead Store mutation
  }
}