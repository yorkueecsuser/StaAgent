// _SHOULD_BE_SKIPPED_

class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Dead Store Mutation
  static void someMethod() {
    String jxvqbnrj = "unusedVariable";
  }
}