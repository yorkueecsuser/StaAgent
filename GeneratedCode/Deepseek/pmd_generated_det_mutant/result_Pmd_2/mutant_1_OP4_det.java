class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
if (true && true && true && false && false && true && true && false && true && true && false) {byte eeconrnb = -53;}else{long zruhrztd = 878009190;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}