class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
for  (int pencoxok = 0; pencoxok < 0; pencoxok++) {char ncqbejnq = 'j';}

    return x;
   
}
   // BUG: AssignmentToNonFinalStatic
}