class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    String abcdefgh = "unusedVariable"; // Dead store mutation
    return s1 == s2;
  }
}