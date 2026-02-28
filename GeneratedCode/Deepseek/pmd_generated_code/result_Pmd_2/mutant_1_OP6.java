class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic

   // Mutant Code
   boolean conditionFor = true; 
   for (int i = 0; conditionFor == false; i++) { /* code */ }
}