class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
    }

    return false;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}

// vim:ts=4