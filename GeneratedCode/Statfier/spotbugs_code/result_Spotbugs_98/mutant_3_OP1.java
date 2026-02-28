class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    String qvbnrhty = "unusedVariable"; // Dead store mutation
    return (o instanceof Long)? (Long) o : null;
  }
}