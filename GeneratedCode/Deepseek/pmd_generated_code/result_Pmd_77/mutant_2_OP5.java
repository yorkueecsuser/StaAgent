class Car {
   public static void main(String[] args) {
    // do something
    boolean condition = getCondition();
    if (condition) { 
        // Added mutant code
        System.out.println("Unreachable code");
    }
   }
   
   public static boolean getCondition() {
        return false;
   }
}