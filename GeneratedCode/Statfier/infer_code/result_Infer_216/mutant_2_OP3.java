import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;
import javax.annotation.Nullable;

interface AnnotatedInterface {

  @PerformanceCritical
  void annotatedPerformanceCriticalInInterface();
}

class Other {

  @Expensive
  void expensive() {}

  void callsExpensive1() {
    expensive();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callsExpensive1");
    }
  }

  void inexpensiveMethod() {}
}

@Expensive
class ExpensiveClass {

  void anExpensiveMethod() {}
}

@PerformanceCritical
class PerformanceCriticalClass {

  void performanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in performanceCriticalMethod1");
    }
  }

  void performanceCriticalMethod2(Other o) {
    o.expensive(); // should report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in performanceCriticalMethod2");
    }
  }

  void performanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in performanceCriticalMethod3");
    }
  }

  void performanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in performanceCriticalMethod4");
    }
  }
}

class ExpensiveSubclass extends ExpensiveClass {

  void anotherExpensiveMethod() {}
}

class PerformanceCriticalSubclass extends PerformanceCriticalClass {

  void subclassPerformanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in subclassPerformanceCriticalMethod1");
    }
  }

  void subclassPerformanceCriticalMethod2(ExpensiveSubclass c) {
    c.anotherExpensiveMethod(); // should report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in subclassPerformanceCriticalMethod2");
    }
  }

  void subclassPerformanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in subclassPerformanceCriticalMethod3");
    }
  }

  void subclassPerformanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in subclassPerformanceCriticalMethod4");
    }
  }
}

class ExpensiveCallExample implements AnnotatedInterface {

  @Nullable Other mOther;

  void nonExpensiveMethod() {}

  @Expensive
  void expensiveMethod() {
    // The checker should still report the expensive call stack despite the call cycle
    methodWrapper();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in expensiveMethod");
    }
  }

  void methodWrapper() {
    expensiveMethod();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in methodWrapper");
    }
  }

  @PerformanceCritical
  void notCallingExpensiveMethod() {
    nonExpensiveMethod();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in notCallingExpensiveMethod");
    }
  }

  @PerformanceCritical
  void directlyCallingExpensiveMethod() {
    expensiveMethod();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in directlyCallingExpensiveMethod");
    }
  }

  @PerformanceCritical
  void indirectlyCallingExpensiveMethod() {
    methodWrapper();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in indirectlyCallingExpensiveMethod");
    }
  }

  @PerformanceCritical
  void callingExpensiveMethodFromInterface(ExpensiveInterfaceExample object) {
    object.m5();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callingExpensiveMethodFromInterface");
    }
  }

  void callsExpensive2() {
    mOther.callsExpensive1();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callsExpensive2");
    }
  }

  @PerformanceCritical
  void longerCallStackToExpensive() {
    callsExpensive2();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in longerCallStackToExpensive");
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromView(ImageView view, int id) {
    return view.findViewById(id);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callsFindViewByIdFromView");
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromActivity(FragmentActivity activity, int id) {
    return activity.findViewById(id);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callsFindViewByIdFromActivity");
    }
  }

  @PerformanceCritical
  void callMethodOnExpensiveClass(ExpensiveClass c) {
    c.anExpensiveMethod();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callMethodOnExpensiveClass");
    }
  }

  public void annotatedPerformanceCriticalInInterface() {
    mOther.callsExpensive1();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in annotatedPerformanceCriticalInInterface");
    }
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement in callsExpensiveInConditionalBranch");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}