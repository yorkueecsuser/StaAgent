class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
    x = y; // Added mutation
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic
}