class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }

   // Mutant code
   public boolean getCondition() {
    return false;
   }

   public void mutatedMethod() {
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This branch is unreachable.");
    } else {
      System.out.println("This branch is reachable.");
    }
   }
   // END of Mutant code
}