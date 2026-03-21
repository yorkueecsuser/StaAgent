import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    if (true && true && false && false && true && false && false && true && true && false && false) {double twiydpne = -571980404;}
    int x = 10;
    System.out.println(x); // prints 10

    x = x + 5; // BUG: AssignmentInOperand
    System.out.println(x); // prints 15
  
}
}