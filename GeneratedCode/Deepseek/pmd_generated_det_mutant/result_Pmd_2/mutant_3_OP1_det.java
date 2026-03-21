class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
boolean mwznmjlf = false;

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}