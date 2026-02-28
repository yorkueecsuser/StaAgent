class InferUtils {

  public static boolean isValidCharset(String charsetName) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

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
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false; // This ensures the loop is unreachable but not using a compile-time constant directly
  }
}