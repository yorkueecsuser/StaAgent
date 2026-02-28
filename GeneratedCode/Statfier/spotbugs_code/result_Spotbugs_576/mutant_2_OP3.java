class FieldDereference {

  String list;

  public FieldDereference(String list) {
    this.list = list;
  }

  public int dereferenceOfField(String one) {
    if (list == null && one!= null) {
      list = one;
    }
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    if (list == null && one!= null) {
      list = one;
    }
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }
    return list.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}