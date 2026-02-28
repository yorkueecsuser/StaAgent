class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop will never execute because conditionFor is always false
      }
    }

    class Inner2 {}

    private boolean getCondition() {
      return false;
    }
  }
}