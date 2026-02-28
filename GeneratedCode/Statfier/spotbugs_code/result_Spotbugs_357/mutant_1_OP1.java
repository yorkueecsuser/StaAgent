class IgnoredTrim {

  public void f(String s) {
    s.trim();
    String abcdefgh = "unusedVariable";
  }
}