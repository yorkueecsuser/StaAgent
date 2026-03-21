class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
if (true && true && true && true && false && true && false && false && false && false && false) {short mqvndocu = -9167;}else{int hayrunrl = 615144751;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}