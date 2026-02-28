class Issue1764 {
  boolean func() {
    String s1 = "str1";
    final String s2 = "str2";
    return s1 == s2;
  }

  boolean func_mutated() {
    String a = "str1";
    final String s2 = "str2";
    return a == s2;
  }
}