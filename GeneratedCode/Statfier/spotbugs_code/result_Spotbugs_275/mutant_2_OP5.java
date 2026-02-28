class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        y = "unreachable";
        break;
      default:
        y = "still unreachable";
        break;
    }

    return y.hashCode();
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}