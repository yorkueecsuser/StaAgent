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

  // Mutant 1: Renamed 'one' to 'a'
  public int dereferenceOfFieldMutant1(String a) {
    if (list == null && a!= null) {
      list = a;
    }
    return list.hashCode();
  }

  public int dereferenceOfVariable(String one, String list) {
    if (list == null && one!= null) {
      list = one;
    }
    return list.hashCode();
  }

  // Mutant 2: Renamed 'one' to 'b'
  public int dereferenceOfVariableMutant1(String b, String list) {
    if (list == null && b!= null) {
      list = b;
    }
    return list.hashCode();
  }

  // Mutant 3: Renamed 'list' parameter to 'c'
  public int dereferenceOfVariableMutant2(String one, String c) {
    if (c == null && one!= null) {
      c = one;
    }
    return c.hashCode();
  }
}