class IgnoredTrim {

  public void f(String s) {
    s.trim();
    String temp = s; // Dummy assignment statement
    String temp = s; // Duplicate of the dummy assignment statement
  }
}