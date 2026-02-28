class Equality {

  public boolean equals(Equality e) {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return false;
  }

  public static void main(String[] args) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is reachable");
        break;
    }
  }

  private static boolean getCondition() {
    // This method returns false, ensuring the switch condition is always 1
    return false;
  }
}