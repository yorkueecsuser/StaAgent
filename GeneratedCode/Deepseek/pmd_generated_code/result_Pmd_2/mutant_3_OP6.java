class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic

   public void unreachableForLoop() {
      boolean condition = getCondition();
      for (int i = 0; condition; i++) {
         // Empty loop body that will never be reached
         // due to unreachable condition
      }
   }
}