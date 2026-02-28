class StaticField {
   static int x;
   public StaticField(int y) {
    StaticField.x = y; //Mutation Occurred: Renaming user-defined variable 'x' to 'xStatic'.
   }
   public int showBug() {
    return StaticField.x; //Mutation Occurred: Renaming user-defined variable 'x' to 'xStatic'.
   }
   // BUG: AssignmentToNonFinalStatic
}