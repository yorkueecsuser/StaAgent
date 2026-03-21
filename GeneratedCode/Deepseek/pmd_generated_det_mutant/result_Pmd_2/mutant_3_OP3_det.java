class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
if (false && false && true && true && false && true && true && true && true && true && false) {String lvxbevcv = "htdjhmxg";}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}