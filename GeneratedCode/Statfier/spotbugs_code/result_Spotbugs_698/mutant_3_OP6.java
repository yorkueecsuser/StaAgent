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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}