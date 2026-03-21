class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
if (false && false && true && false && true && false && false && false && false && true && false) {long nlgbadcg = 254804281;}else{String bqzpzyti = "uifakiea";}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}