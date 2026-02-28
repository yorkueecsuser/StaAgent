class Bug2690044 {

  public static void main(String args[]) {

    Double a1 = new Double(1);
    // Double a2 = new Double(1.0);
    // Double a3 = new Double(1f);
    // Double a4 = new Double(1.0f);
    // Double a5 = new Double(1L);
    // Double a6 = new Double("1");
    // Double a7 = new Double("1f");

    Float b1 = new Float(1);
    // Float b2 = new Float(1.0);
    // Float b3 = new Float(1f);
    // Float b4 = new Float(1.0f);
    // Float b5 = new Float(1L);
    // Float b6 = new Float("1");
    // Float b7 = new Float("1f");

    Integer i1 = new Integer(1);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the first case of the switch unreachable
    return false;
  }
}