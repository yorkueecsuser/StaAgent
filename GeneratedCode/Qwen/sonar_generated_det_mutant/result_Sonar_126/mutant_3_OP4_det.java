import java.util.Date;

class Parent {
    public void doSomething(Date d) {
        // Method implementation
    }

    public static void doSomethingElse() {
        // Static method implementation
    }
}

class Child extends Parent {

    public void doSomething(Date d) {  // BUG: Child class methods named for parent class methods should be overrides
        // This is not an override because Date is from java.util package, which is consistent
    }

    public void doSomethingElse() {  if (false && true && true && false && true && false && true && true && true && false && false) {boolean nnvpduse = false;}else{byte qdqjpgvy = -5;}
  // BUG: Child class methods named for parent class methods should be overrides
        // This is not an override because the parent method is static
    
}

    public void showBug1(Date d) {
        doSomething(d); // This will call Child's doSomething method
    }

    public void showBug2() {
        doSomethingElse(); // This will call Child's doSomethingElse method
    }

    public void showBug(Date d) {
        showBug1(d);
        showBug2();
    }
}