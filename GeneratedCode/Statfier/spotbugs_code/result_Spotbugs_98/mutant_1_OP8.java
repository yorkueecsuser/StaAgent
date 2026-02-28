class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;

    // Mutant code
    Object x = o; // Renamed 'o' to 'x'
    assert x instanceof Long : "Supplied object is not a Long object";
    return (x instanceof Long)? (Long) x : null;
  }
}