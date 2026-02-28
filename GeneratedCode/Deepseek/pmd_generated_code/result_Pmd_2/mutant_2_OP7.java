class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    while (false) {
      // do nothing, unreachable loop
    }
    return x;
   }
   // BUG: AssignmentToNonFinalStatic
}