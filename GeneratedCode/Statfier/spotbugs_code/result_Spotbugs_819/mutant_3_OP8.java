class Issue744 {

  public double testParsingBad3(String value) {
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    String x = value;
    return Double.valueOf(x).doubleValue();
  }

  public double testParsingGood3(String value) {
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    String y = value;
    return Float.valueOf(y).floatValue();
  }

  public float testParsingGood4(String value) {
    return Float.parseFloat(value);
  }
}