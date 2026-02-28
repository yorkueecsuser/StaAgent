class Car {
   public static void main(String[] args) {
    // do something
   }

   public static boolean getCondition() {
       return false;
   }

   public static int getValue() {
       return 0;
   }

   // code
   public void methodWithUnreachableIfElseStatement() {
       boolean shouldRun = getCondition();
       if (shouldRun) {
           System.out.println("This code is reachable.");
       } else {
           System.out.println("This code is unreachable.");
       }
   }
}