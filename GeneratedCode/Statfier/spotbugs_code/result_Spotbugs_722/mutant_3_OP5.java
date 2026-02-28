class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    // Introducing an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code.");
        break;
    }

    if (o instanceof EqualToAString) return name.equals(((EqualToAString) o).name);
    if (o instanceof String) {
      return name.equals(o);
    }
    return false;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}