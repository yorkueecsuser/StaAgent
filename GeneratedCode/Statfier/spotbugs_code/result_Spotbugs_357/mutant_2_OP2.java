class IgnoredTrim {

  public void f(String s) {
    String trimmedString = s.trim();
    String trimmedStringCopy = s.trim(); // Duplicated assignment statement
  }
}