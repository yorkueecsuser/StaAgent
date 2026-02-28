class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof EqualToAString) return name.equals(((EqualToAString) o).name);
    if (o instanceof String) {
      return name.equals(o);
    }
    return false;
  }

  // Mutated code with renaming of variable 'name' to 'x'
  final String x;

  public EqualToAString(String x) {
    this.x = x;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof EqualToAString) return x.equals(((EqualToAString) o).x);
    if (o instanceof String) {
      return x.equals(o);
    }
    return false;
  }
}