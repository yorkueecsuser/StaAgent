class FieldDereference {

  String list;

  public FieldDereference(String list) {
    this.list = list;
  }

  public int dereferenceOfField(String one) {
    if (list == null && one!= null) {
      list = one;
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      list = "unreachable";
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    if (list == null && one!= null) {
      list = one;
    }
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      list = "unreachable";
    }
    return list.hashCode();
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}