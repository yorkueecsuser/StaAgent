import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    if (true && false && false && false && true && true && true && false && false && true && false) {boolean srulqfbp = true;}
    int x = 10;
    System.out.println(x); // prints 10

    x = x + 5; // BUG: AssignmentInOperand
    System.out.println(x); // prints 15
  
}
}