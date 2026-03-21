class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
int oqbznuwh = 0;switch  (oqbznuwh) {case 1:short uacsoqmt = -614;break;default:String xqsvumfq = "lnoxmvbx";break;}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}