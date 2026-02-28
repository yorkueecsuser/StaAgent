class FieldDereference {

  String list;

  public FieldDereference(String list) {
    this.list = list;
  }

  public int dereferenceOfField(String one) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    if (list == null && one!= null) {
      list = one;
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    if (list == null && one!= null) {
      list = one;
    }
    return list.hashCode();
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the while loop unreachable
  }
}