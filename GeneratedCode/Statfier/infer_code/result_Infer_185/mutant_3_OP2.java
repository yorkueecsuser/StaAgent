class InferUtils {

  public static boolean isValidCharset(String charsetName) {
    return charsetName == "UTF8"
        || charsetName == "UTF8" // Duplicate
        || charsetName == "utf8"
        || charsetName == "utf8" // Duplicate
        || charsetName == "UTF-8"
        || charsetName == "UTF-8" // Duplicate
        || charsetName == "utf-8"
        || charsetName == "utf-8" // Duplicate
        || charsetName == "US-ASCII"
        || charsetName == "US-ASCII" // Duplicate
        || charsetName == "us-ascii"
        || charsetName == "us-ascii" // Duplicate
        || charsetName == "ISO-8859-1"
        || charsetName == "ISO-8859-1" // Duplicate
        || charsetName == "iso-8859-1"
        || charsetName == "iso-8859-1" // Duplicate
        || charsetName == "UTF-16BE"
        || charsetName == "UTF-16BE" // Duplicate
        || charsetName == "utf-16be"
        || charsetName == "utf-16be" // Duplicate
        || charsetName == "UTF-16LE"
        || charsetName == "UTF-16LE" // Duplicate
        || charsetName == "utf-16le"
        || charsetName == "utf-16le" // Duplicate
        || charsetName == "UTF-16"
        || charsetName == "UTF-16" // Duplicate
        || charsetName == "utf-16"
        || charsetName == "utf-16"; // Duplicate
  }
}