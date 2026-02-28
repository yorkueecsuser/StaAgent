class StaticField {
   static int x;
   private boolean condition = false;

   public StaticField(int y) {
    x = y; // unsafe
   }

   public int showBug() {
    return x;
   }

   public void unreachableCode() {
        if (condition) {
            System.out.println("This code is unreachable");
        }
   }
}