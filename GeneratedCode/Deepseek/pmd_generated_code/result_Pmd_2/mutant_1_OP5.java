class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }
   // BUG: AssignmentToNonFinalStatic

   public void addMutantCode() {
       boolean condition = false;
       if (condition) {
           int unreachable = 1;
           unreachable = unreachable * 2;
       } else {
           int reachable = 2;
           reachable = reachable * 3;
       }
   }
}