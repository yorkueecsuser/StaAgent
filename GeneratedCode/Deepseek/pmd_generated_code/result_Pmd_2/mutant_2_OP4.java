class StaticField {
   static int x;
   public StaticField(int y) {
        if (false) {
            x = 0;
        } else {
            x = y; // Mutant
        }
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic
}