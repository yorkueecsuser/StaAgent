class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
    // Dead Store Mutation
    String qzjxvbgt = "unusedVariable";
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof EqualToAString) return name.equals(((EqualToAString) o).name);
    if (o instanceof String) {
      return name.equals(o);
    }
    return false;
  }
}