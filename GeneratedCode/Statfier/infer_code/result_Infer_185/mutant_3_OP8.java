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

    // Mutant code with renamed variable
    String a = charsetName;
    return a == "UTF8"
        || a == "utf8"
        || a == "UTF-8"
        || a == "utf-8"
        || a == "US-ASCII"
        || a == "us-ascii"
        || a == "ISO-8859-1"
        || a == "iso-8859-1"
        || a == "UTF-16BE"
        || a == "utf-16be"
        || a == "UTF-16LE"
        || a == "utf-16le"
        || a == "UTF-16"
        || a == "utf-16";
  }
}