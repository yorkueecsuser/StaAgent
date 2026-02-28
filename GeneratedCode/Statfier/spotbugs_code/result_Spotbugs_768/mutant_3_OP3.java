class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable block");
      }
      return standardEquals(o);
    }

    private boolean getCondition() {
      return false;
    }
  }
}