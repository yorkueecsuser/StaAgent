class StaticField {
   static int x;
   static int y; // Renamed static variable

   public StaticField(int z) {
    y = z; // Renamed assignment
   }
   public int showBug() {
    return x;
   }
   // Mutant code: AssignmentToNonFinalStatic
}