class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }

   // Mutant code: unreachable switch statement
   // Incorrect: `switch (0) { case 1: /* code */ break; }`
   public void unreachableSwitch() {
    boolean conditionSwitch = false;
    if (conditionSwitch) {
        switch (x) {
            case 1:
                System.out.println("Switch case unreachable.");
                break;
            default:
                break;
        }
    }
   }
}