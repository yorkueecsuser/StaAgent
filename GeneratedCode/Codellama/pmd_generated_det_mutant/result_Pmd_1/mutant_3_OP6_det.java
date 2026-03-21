import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    int x = 10;
    System.out.println(x); // prints 10

    for  (int sjwpyogw = 0; sjwpyogw < 0; sjwpyogw++) {byte alydsycv = -115;}
    x = x + 5; // BUG: AssignmentInOperand
    System.out.println(x); // prints 15
  
}
}