class IgnoredTrim {

  public void f(String s) {
    s.trim();
    // Mutant code with renaming
    String x = s;
    x.trim();
  }
}