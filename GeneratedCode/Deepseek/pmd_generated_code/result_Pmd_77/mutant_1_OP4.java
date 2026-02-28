class Car {
   public static void main(String[] args) {
    // do something
   }
   // code
   public void addUnreachableIfElse() {
      boolean condition = false;
      if (condition == true) {
         // Unreachable code
         System.out.println("This code will never execute");
      } else {
         System.out.println("This code will execute");
      }
   }
}