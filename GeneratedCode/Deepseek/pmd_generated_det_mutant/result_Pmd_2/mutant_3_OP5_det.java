class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
int despgjuk = 0;switch  (despgjuk) {case 1:boolean ocrevcfk = true;break;default:float zathchpc = -628341795;break;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}