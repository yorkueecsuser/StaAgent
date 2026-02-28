class EqualToAString {

  final String name;

  public EqualToAString(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    // Introducing an unreachable if-else statement
    boolean alwaysFalse = getAlwaysFalse();
    if (alwaysFalse) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
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