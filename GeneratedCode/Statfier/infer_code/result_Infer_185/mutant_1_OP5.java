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

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case will also never be executed
        System.out.println("This is another unreachable case");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}