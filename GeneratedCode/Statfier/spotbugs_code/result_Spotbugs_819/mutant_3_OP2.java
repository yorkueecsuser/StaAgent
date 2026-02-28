class Issue744 {

  public double testParsingBad3(String value) {
    double temp = new Double(value).doubleValue();
    double tempCopy = temp; // Duplicate assignment
    return temp;
  }

  public double testParsingBad3a(String value) {
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    double parsedValue = Double.parseDouble(value);
    double parsedValueCopy = parsedValue; // Duplicate assignment
    return parsedValue;
  }

  public float testParsingBad4(String value) {
    float temp = new Float(value).floatValue();
    float tempCopy = temp; // Duplicate assignment
    return temp;
  }

  public float testParsingBad4a(String value) {
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    float parsedValue = Float.parseFloat(value);
    float parsedValueCopy = parsedValue; // Duplicate assignment
    return parsedValue;
  }
}