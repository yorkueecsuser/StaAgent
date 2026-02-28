class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;
  }

  // Mutated code with renaming of variable 'o' to 'a'
  public Long convertToLongMutant(Object a) {
    assert a instanceof Long : "Supplied object is not a Long object";
    return (a instanceof Long)? (Long) a : null;
  }
}