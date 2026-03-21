import java.util.*;

class AssignmentInOperand {
  public static void main(String[] args) {
    int dsrxymoz = 10;
    System.out.println(dsrxymoz); // prints 10

    dsrxymoz = dsrxymoz + 5; // BUG: AssignmentInOperand
    System.out.println(dsrxymoz); // prints 15
  }
}