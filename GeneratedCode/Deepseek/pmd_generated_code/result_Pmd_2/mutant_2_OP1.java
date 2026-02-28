class StaticField {
   static int x;
   static String deadStoreMutant;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic
}