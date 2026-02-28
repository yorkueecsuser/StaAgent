class StaticField {
   static int x;
   public StaticField(int y) {
    x = y; // unsafe
   }
   public int showBug() {
    return x;
   }

   public void unreachableIfStatementMutant(){
      boolean condition = getCondition();
      if (condition) {
          System.out.println("This statement should never be executed");
      }
   }

   // Unreachable code
   public boolean getCondition(){
       // This function will always return false, thus making the if condition in unreachableIfStatementMutant() always false
       return false;
   }
}