class Issue744 {

  public double testParsingBad3(String value) {
    double result = new Double(value).doubleValue();
    double resultCopy = new Double(value).doubleValue(); // Duplicate assignment
    return result;
  }

  public double testParsingBad3a(String value) {
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    double result = Double.parseDouble(value);
    double resultCopy = Double.parseDouble(value); // Duplicate assignment
    return result;
  }

  public float testParsingBad4(String value) {
    float result = new Float(value).floatValue();
    float resultCopy = new Float(value).floatValue(); // Duplicate assignment
    return result;
  }

  public float testParsingBad4a(String value) {
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    float result = Float.parseFloat(value);
    float resultCopy = Float.parseFloat(value); // Duplicate assignment
    return result;
  }
}