class EqStringTestIsBetter {
  public boolean test(String a) {
    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}

// vim:ts=4