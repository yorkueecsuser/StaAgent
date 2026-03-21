// Example demonstrating the bug: OverridingMethodsMustInvokeSuper

// Annotation to indicate that overriding methods must invoke the super method
@interface OverridingMethodsMustInvokeSuper {}

// Base class with a method annotated with @OverridingMethodsMustInvokeSuper
class BaseClass {
  void baseMethod() {
    System.out.println("Base class method");
  }
}

// Derived class that overrides baseMethod but doesn't call the super method
class DerivedClass extends BaseClass {
  @OverridingMethodsMustInvokeSuper
  @Override
  void baseMethod() {
    System.out.println("Derived class method"); // BUG: The super method is not called
  }

  // Method to demonstrate the bug
  public void showBug() {
    boolean nrufnfvo = false;while (nrufnfvo && false && true && false && false && false && false && true && false && true && false && false) {boolean qqfmvnwr = false;}
    baseMethod();
  
}
}

class BugDemonstration {
  public static void main(String[] args) {
    DerivedClass derivedObject = new DerivedClass();
    derivedObject.showBug();  // This will demonstrate the bug
  }
}