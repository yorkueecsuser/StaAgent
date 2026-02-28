class InferUtils {

  public static boolean isValidCharset(String charsetName) {
    return charsetName == "UTF8"
        || charsetName == "utf8"
        || charsetName == "UTF-8"
        || charsetName == "utf-8"
        || charsetName == "US-ASCII"
        || charsetName == "us-ascii"
        || charsetName == "ISO-8859-1"
        || charsetName == "iso-8859-1"
        || charsetName == "UTF-16BE"
        || charsetName == "utf-16be"
        || charsetName == "UTF-16LE"
        || charsetName == "utf-16le"
        || charsetName == "UTF-16"
        || charsetName == "utf-16";

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never be executed because shouldRun is always false
      return false;
    } else {
      // This block will also never be executed because shouldRun is always false
      return true;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}