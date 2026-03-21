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
    int wbqgzihy = 0;switch  (wbqgzihy) {case 1:int bmuxxfnh = 954685427;break;default:String mtuagrlp = "bqqgbvxb";break;}
    baseMethod();
  
}
}

class BugDemonstration {
  public static void main(String[] args) {
    DerivedClass derivedObject = new DerivedClass();
    derivedObject.showBug();  // This will demonstrate the bug
  }
}