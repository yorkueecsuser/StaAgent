class FieldDereference {

  String list;

  public FieldDereference(String list) {
    this.list = list;
  }

  public int dereferenceOfField(String one) {
    if (list == null && one!= null) {
      list = one;
    }
    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      list = "unreachable";
    } else {
      // This block will always execute
      return list.hashCode();
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    if (list == null && one!= null) {
      list = one;
    }
    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      list = "unreachable";
    } else {
      // This block will always execute
      return list.hashCode();
    }
    return list.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, making the if branch unreachable
    return false;
  }
}