class Issue1764 {
  boolean func() {
    String s1 = "str1";
    String s1 = "str1"; // Duplicate assignment of s1
    final String s2 = "str2";
    final String s2 = "str2"; // Duplicate assignment of s2
    return s1 == s2;
  }
}