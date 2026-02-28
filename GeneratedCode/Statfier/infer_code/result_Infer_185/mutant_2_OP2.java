class InferUtils {

  public static boolean isValidCharset(String charsetName) {
    return charsetName == "UTF8"
        || charsetName == "UTF8" // Mutant: duplicated line
        || charsetName == "utf8"
        || charsetName == "utf8" // Mutant: duplicated line
        || charsetName == "UTF-8"
        || charsetName == "UTF-8" // Mutant: duplicated line
        || charsetName == "utf-8"
        || charsetName == "utf-8" // Mutant: duplicated line
        || charsetName == "US-ASCII"
        || charsetName == "US-ASCII" // Mutant: duplicated line
        || charsetName == "us-ascii"
        || charsetName == "us-ascii" // Mutant: duplicated line
        || charsetName == "ISO-8859-1"
        || charsetName == "ISO-8859-1" // Mutant: duplicated line
        || charsetName == "iso-8859-1"
        || charsetName == "iso-8859-1" // Mutant: duplicated line
        || charsetName == "UTF-16BE"
        || charsetName == "UTF-16BE" // Mutant: duplicated line
        || charsetName == "utf-16be"
        || charsetName == "utf-16be" // Mutant: duplicated line
        || charsetName == "UTF-16LE"
        || charsetName == "UTF-16LE" // Mutant: duplicated line
        || charsetName == "utf-16le"
        || charsetName == "utf-16le" // Mutant: duplicated line
        || charsetName == "UTF-16"
        || charsetName == "UTF-16"; // No additional duplication here to avoid unreachable statement
  }
}