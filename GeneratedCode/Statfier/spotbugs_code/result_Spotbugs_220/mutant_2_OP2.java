class StringEqualityTest {

  boolean almostEmpty(String s) {
    return s.trim() == ""; // Original line
    boolean result = s.trim() == ""; // Duplicated line with unique variable name
  }
}