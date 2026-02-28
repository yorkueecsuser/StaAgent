class Bug2876945 {

  public Long convertToLong(Object o) {
    assert o instanceof Long : "Supplied object is not a Long object";
    return (o instanceof Long)? (Long) o : null;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is another unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}