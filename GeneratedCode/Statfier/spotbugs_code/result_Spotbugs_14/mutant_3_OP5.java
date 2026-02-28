class EqStringTestIsBetter {
  public boolean test(String a) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This switch case is unreachable");
        break;
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}

// vim:ts=4