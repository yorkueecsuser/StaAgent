class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
for  (int iehbjrhx = 0; iehbjrhx < 0; iehbjrhx++) {int atzzxepv = -699584577;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}