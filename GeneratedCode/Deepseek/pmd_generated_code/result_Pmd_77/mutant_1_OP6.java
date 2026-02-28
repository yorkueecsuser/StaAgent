class Car {
   public static void main(String[] args) {
    // do something

    int condition = 0; // Mutation operator: Unreachable for loop. Unreachable code is added.
    for (int i = 0; condition == 0; i++) {
       System.out.println("Unreachable loop.");
    }
   }
   // code
}