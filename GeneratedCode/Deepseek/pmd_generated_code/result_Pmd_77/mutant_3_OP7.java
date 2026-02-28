class Car {
   public static void main(String[] args) {
    // do something
   }
   // code
}

class UnreachableWhileLoopMutant {
   public static void main(String[] args) {
    // do something
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
        //unreachable code
    }
   }
   static boolean getCondition() {
       return false;
   }
}