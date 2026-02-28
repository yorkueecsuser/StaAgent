class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }
    }

    class Inner2 {}

    private boolean getCondition() {
      return false;
    }
  }
}