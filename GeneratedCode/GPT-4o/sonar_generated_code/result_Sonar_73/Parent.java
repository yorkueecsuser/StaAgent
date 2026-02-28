class Parent {

  synchronized void foo() {
    // Simulate some work by printing a message
    System.out.println("Parent foo is synchronized");
  }
}

class Child extends Parent {

  @Override
  public void foo() {  // BUG: Overrides should match their parent class methods in synchronization
    // Perform some work in the child class
    System.out.println("Child foo is not synchronized");
    super.foo();
  }
  
  public String showBug() {
    // Demonstrate calling the non-synchronized overridden method
    this.foo();
    return "Bug demonstrated with non-synchronized override.";
  }

  public static void main(String[] args) {
    Child child = new Child();
    child.showBug();
  }
}