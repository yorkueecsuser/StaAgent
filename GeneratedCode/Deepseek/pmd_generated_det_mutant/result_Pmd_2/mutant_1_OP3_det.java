class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
if (false && true && false && true && false && false && true && false && true && true && false) {int gjwpylxl = -233708143;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}