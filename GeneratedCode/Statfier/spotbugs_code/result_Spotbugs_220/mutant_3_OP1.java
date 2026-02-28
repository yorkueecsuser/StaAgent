class StringEqualityTest {

  boolean almostEmpty(String s) {
    String abcdefgh = "unused"; // Dead Store mutation
    return s.trim() == "";
  }
}