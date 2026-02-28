class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else block.");
    }
    return false;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }

  public static void main(String[] args) {}
}