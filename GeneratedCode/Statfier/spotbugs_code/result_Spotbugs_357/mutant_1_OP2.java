class IgnoredTrim {

  public void f(String s) {
    s.trim();
    String duplicate = s; // Unique duplication of a variable without method invocation
  }
}