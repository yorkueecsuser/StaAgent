import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    if (true && true && true && false && true && false && false && true && true && true && false) {float wxcjhssa = -625156615;}
    int x = 10;
    System.out.println(x); // prints 10

    x = x + 5; // BUG: AssignmentInOperand
    System.out.println(x); // prints 15
  
}
}