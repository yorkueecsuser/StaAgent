class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }

    // Inserting unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        y = "This will never be reached";
        break;
      default:
        y = "This is also never reached";
        break;
    }

    return y.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}