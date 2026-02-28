class FieldDereference {

  String list;

  public FieldDereference(String list) {
    this.list = list;
    // Dead Store Mutation
    String abcdefgh = "unused";
  }

  public int dereferenceOfField(String one) {
    if (list == null && one!= null) {
      list = one;
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    if (list == null && one!= null) {
      list = one;
    }
    // Dead Store Mutation
    int ijklmnop = 42;
    return list.hashCode();
  }
}