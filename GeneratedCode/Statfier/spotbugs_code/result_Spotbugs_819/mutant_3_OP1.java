class Issue744 {

  public double testParsingBad3(String value) {
    String qwejfnxz; // Dead Store
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    int klnmopqr; // Dead Store
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean rstuvwxy; // Dead Store
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    char abcdghij; // Dead Store
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    long mnopqrst; // Dead Store
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    short tuvwxyzq; // Dead Store
    return Float.parseFloat(value);
  }
}