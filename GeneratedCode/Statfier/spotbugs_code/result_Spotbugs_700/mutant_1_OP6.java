class Bug2539601 {
  int i;

  class Inner1 {
    {
      System.out.println(i);
      // Introduced unreachable for loop
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because getCondition() will always return false
      }
    }

    class Inner2 {}

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
      return false;
    }
  }
}