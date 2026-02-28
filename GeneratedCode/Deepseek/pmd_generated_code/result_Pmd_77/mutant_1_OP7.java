class Car {
   public static void main(String[] args) {
    // do something
   }
   // code
   {
       boolean conditionWhile = getCondition(); 
       while (conditionWhile) { 
           // unreachable code
       }
   }
   {
       boolean conditionFor = getCondition(); 
       for (int i = 0; conditionFor; i++) { 
           // unreachable code
       }
   }
}