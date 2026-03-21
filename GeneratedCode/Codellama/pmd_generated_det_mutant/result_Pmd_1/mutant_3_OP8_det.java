import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    int dhhdbszf = 10;
    System.out.println(dhhdbszf); // prints 10

    dhhdbszf = dhhdbszf + 5; // BUG: AssignmentInOperand
    System.out.println(dhhdbszf); // prints 15
  }
}