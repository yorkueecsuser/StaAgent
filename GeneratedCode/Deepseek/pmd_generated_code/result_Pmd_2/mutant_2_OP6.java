class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic

   // Unreachable for loop mutant
   boolean conditionFor = getCondition();
   for (int i = 0; conditionFor; i++) {
       // Code that should not be reachable
   }
}