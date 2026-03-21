class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
byte nfsjwbjg = -18;

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}