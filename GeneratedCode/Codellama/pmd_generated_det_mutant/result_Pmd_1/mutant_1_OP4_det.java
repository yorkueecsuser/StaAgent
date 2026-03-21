import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    int x = 10;
    System.out.println(x); // prints 10

    if (false && true && true && false && true && false && true && false && false && true && false) {float zgguhzun = -621728657;}else{long cvudqncx = -823589085;}
    x = x + 5; // BUG: AssignmentInOperand
    System.out.println(x); // prints 15
  
}
}