class Car {
   public static void main(String[] args) {
    // do something
    boolean shouldRun = getCondition();
    if (shouldRun) { 
        System.out.println("This code should execute");
    }
   }
   
   // code
   public static boolean getCondition() {
       return false;
   }
}