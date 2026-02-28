class IgnoredTrim {

  public void f(String s) {
    s.trim();
    String a = s; // Mutant code: Renamed's' to 'a'
    a.trim();     // Mutant code: Using the renamed variable 'a'
  }
}