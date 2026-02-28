class InferUtils {

  public static boolean isValidCharset(String charsetName) {
    return charsetName == "UTF8"
        || charsetName == "UTF8" // Mutant: Duplicate of the previous line
        || charsetName == "utf8"
        || charsetName == "utf8" // Mutant: Duplicate of the previous line
        || charsetName == "UTF-8"
        || charsetName == "UTF-8" // Mutant: Duplicate of the previous line
        || charsetName == "utf-8"
        || charsetName == "utf-8" // Mutant: Duplicate of the previous line
        || charsetName == "US-ASCII"
        || charsetName == "US-ASCII" // Mutant: Duplicate of the previous line
        || charsetName == "us-ascii"
        || charsetName == "us-ascii" // Mutant: Duplicate of the previous line
        || charsetName == "ISO-8859-1"
        || charsetName == "ISO-8859-1" // Mutant: Duplicate of the previous line
        || charsetName == "iso-8859-1"
        || charsetName == "iso-8859-1" // Mutant: Duplicate of the previous line
        || charsetName == "UTF-16BE"
        || charsetName == "UTF-16BE" // Mutant: Duplicate of the previous line
        || charsetName == "utf-16be"
        || charsetName == "utf-16be" // Mutant: Duplicate of the previous line
        || charsetName == "UTF-16LE"
        || charsetName == "UTF-16LE" // Mutant: Duplicate of the previous line
        || charsetName == "utf-16le"
        || charsetName == "utf-16le" // Mutant: Duplicate of the previous line
        || charsetName == "UTF-16"
        || charsetName == "UTF-16" // Mutant: Duplicate of the previous line
        || charsetName == "utf-16"
        || charsetName == "utf-16"; // Mutant: Duplicate of the previous line
  }
}