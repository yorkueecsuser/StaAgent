// _SHOULD_BE_SKIPPED_

class SkippedSourceFile {

  static Object createdBySkippedFile() {
    Object result = null; // Original assignment statement
    Object result = null; // Duplicated assignment statement
    return result;
  }
}