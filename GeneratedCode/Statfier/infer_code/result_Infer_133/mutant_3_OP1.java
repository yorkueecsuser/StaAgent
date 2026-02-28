// _SHOULD_BE_SKIPPED_

class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Mutant code added for Dead Store mutation
  static void someMethod() {
    String qwejrtyp = "unusedVariable";
  }
}