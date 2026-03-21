class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
int dizxwsbx = 0;switch  (dizxwsbx) {case 1:short wlptmkvg = -4267;break;default:int cquybdnh = 99592761;break;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}