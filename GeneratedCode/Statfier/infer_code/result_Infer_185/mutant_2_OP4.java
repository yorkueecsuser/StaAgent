class InferUtils {

  public static boolean isValidCharset(String charsetName) {
    // Original code
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

    // Added unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never be executed
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block will also never be executed due to the nature of the condition
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}