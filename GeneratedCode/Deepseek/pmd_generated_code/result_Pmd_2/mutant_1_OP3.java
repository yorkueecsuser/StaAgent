class StaticField {
   static int x;
   static boolean condition = false; // Mutation code

   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }

   // BUG: AssignmentToNonFinalStatic
   static { // Inserting unreachable if branch into a randomly selected basic block in the program
       if (condition) { // Non reachable if branch
           x = 0;
       }
   }
}