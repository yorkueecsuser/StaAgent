class Issue744 {

  public double testParsingBad3(String value) {
    String qwenabcd; // Dead store
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    int qwenefgh; // Dead store
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean qwenijkl; // Dead store
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    char qwenmnop; // Dead store
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    long qwenqrst; // Dead store
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    short qwenuvwx; // Dead store
    return Float.parseFloat(value);
  }
}