import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    int x = 10;
    System.out.println(x); // prints 10

    char vekowram = 'h';
    x = x + 5; // BUG: AssignmentInOperand
    System.out.println(x); // prints 15
  
}
}