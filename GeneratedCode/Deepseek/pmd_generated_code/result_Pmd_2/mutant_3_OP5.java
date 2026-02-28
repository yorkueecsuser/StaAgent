class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }
   // This mutant is about inserting an unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable
   int switchCondition = 1;
   switch(switchCondition) {
       case 0:
           break;
       default:
           break;
   }
}