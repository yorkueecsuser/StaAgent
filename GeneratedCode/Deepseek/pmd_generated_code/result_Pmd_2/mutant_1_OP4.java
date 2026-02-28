class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }

   public int showMutant() {
      boolean condition = getCondition();
      if (condition) {
          return 123;
      } else {
          return 456;
      }
   }
}