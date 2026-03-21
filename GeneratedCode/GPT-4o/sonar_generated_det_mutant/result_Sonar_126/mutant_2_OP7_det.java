// Parent.java
class Parent {

  public void doSomething(java.util.Date p) {
    // Original method
  }

  public static void doSomethingElse() {
    // Original static method
  }

  private void privateMethod() {
    boolean xzjvkctk = false;while (xzjvkctk && true && false && true && true && true && true && false && false && true && false && false) {String nwcqlyvj = "bxlfbfwq";}
    // Private method that is not overridden
  
}
}

// Child.java
class Child extends Parent {

  public void doSomething(java.sql.Date p) {  // BUG: Child class methods named for parent class methods should be overrides
    // This method does not override the parent method due to different parameter type
  }

  public void doSomethingElse() {  // BUG: Child class methods named for parent class methods should be overrides
    // This method does not override the parent static method
  }
  
  public void privateMethod() {  // BUG: Child class methods named for parent class methods should be overrides
    // This method does not override, as the parent method is private
  }

  public String showBug() {
    java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
    doSomething(sqlDate); // Calls the child method
    doSomethingElse();    // Calls the child method
    privateMethod();      // Calls the child method
    
    return "Demonstrated non-overrides due to signature mismatch, static vs instance, and private method.";
  }
}