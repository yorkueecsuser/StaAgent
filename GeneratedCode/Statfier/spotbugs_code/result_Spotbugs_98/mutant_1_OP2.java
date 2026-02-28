class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    Long result = (o instanceof Long)? (Long) o : null;
    Long resultCopy = (o instanceof Long)? (Long) o : null; // Duplicate assignment statement
    return result;
  }
}