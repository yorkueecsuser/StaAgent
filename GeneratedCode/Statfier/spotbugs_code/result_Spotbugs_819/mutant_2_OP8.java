class Issue744 {

  public double testParsingBad3(String value) {
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    return Float.parseFloat(value);
  }

  // Mutated methods
  public double testParsingBad3b(String x) {
    return new Double(x).doubleValue();
  }

  public double testParsingBad3ab(String y) {
    return Double.valueOf(y).doubleValue();
  }

  public double testParsingGood3b(String z) {
    return Double.parseDouble(z);
  }

  public float testParsingBad4b(String a) {
    return new Float(a).floatValue();
  }

  public float testParsingBad4ab(String b) {
    return Float.valueOf(b).floatValue();
  }

  public float testParsingGood4b(String c) {
    return Float.parseFloat(c);
  }
}