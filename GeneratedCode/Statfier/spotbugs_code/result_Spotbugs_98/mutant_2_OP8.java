class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;
  }

  // Mutated code
  public Long convertToLong(Object a) {
    assert a instanceof Long : "Supplied object is not a Long object";
    return (a instanceof Long)? (Long) a : null;
  }
}