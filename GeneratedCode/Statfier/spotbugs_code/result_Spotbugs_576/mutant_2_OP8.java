class FieldDereference {

  String list;

  public FieldDereference(String list) {
    this.list = list;
  }

  public int dereferenceOfField(String one) {
    if (list == null && one!= null) {
      list = one;
    }
    return list.hashCode();
  }

  // Mutated method with renamed variable
  public int dereferenceOfField(String b) {
    if (list == null && b!= null) {
      list = b;
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    if (list == null && one!= null) {
      list = one;
    }
    return list.hashCode();
  }

  // Mutated method with renamed variable
  public int dereferenceOfVariable(String a, String c) {
    if (c == null && a!= null) {
      c = a;
    }
    return c.hashCode();
  }
}