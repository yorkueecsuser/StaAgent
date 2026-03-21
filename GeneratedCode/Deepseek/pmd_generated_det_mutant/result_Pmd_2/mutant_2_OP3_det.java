class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
if (false && false && false && false && true && true && true && true && true && false && false) {byte kxhpdlds = 22;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}