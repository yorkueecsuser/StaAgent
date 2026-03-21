import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    int odfdxswy = 10;
    System.out.println(odfdxswy); // prints 10

    odfdxswy = odfdxswy + 5; // BUG: AssignmentInOperand
    System.out.println(odfdxswy); // prints 15
  }
}