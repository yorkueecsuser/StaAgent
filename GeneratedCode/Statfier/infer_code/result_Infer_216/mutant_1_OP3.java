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
  }

  void inexpensiveMethod() {}

  // Introduced unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

@Expensive
class ExpensiveClass {

  void anExpensiveMethod() {}

  // Introduced unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

@PerformanceCritical
class PerformanceCriticalClass {

  void performanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
  }

  void performanceCriticalMethod2(Other o) {
    o.expensive(); // should report
  }

  void performanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
  }

  void performanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
  }

  // Introduced unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class ExpensiveSubclass extends ExpensiveClass {

  void anotherExpensiveMethod() {}

  // Introduced unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class PerformanceCriticalSubclass extends PerformanceCriticalClass {

  void subclassPerformanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
  }

  void subclassPerformanceCriticalMethod2(ExpensiveSubclass c) {
    c.anotherExpensiveMethod(); // should report
  }

  void subclassPerformanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report;
  }

  void subclassPerformanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report;
  }

  // Introduced unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class ExpensiveCallExample implements AnnotatedInterface {

  @Nullable Other mOther;

  void nonExpensiveMethod() {}

  @Expensive
  void expensiveMethod() {
    // The checker should still report the expensive call stack despite the call cycle
    methodWrapper();
  }

  void methodWrapper() {
    expensiveMethod();
  }

  @PerformanceCritical
  void notCallingExpensiveMethod() {
    nonExpensiveMethod();
  }

  @PerformanceCritical
  void directlyCallingExpensiveMethod() {
    expensiveMethod();
  }

  @PerformanceCritical
  void indirectlyCallingExpensiveMethod() {
    methodWrapper();
  }

  @PerformanceCritical
  void callingExpensiveMethodFromInterface(ExpensiveInterfaceExample object) {
    object.m5();
  }

  void callsExpensive2() {
    mOther.callsExpensive1();
  }

  @PerformanceCritical
  void longerCallStackToExpensive() {
    callsExpensive2();
  }

  @PerformanceCritical
  View callsFindViewByIdFromView(ImageView view, int id) {
    return view.findViewById(id);
  }

  @PerformanceCritical
  View callsFindViewByIdFromActivity(FragmentActivity activity, int id) {
    return activity.findViewById(id);
  }

  @PerformanceCritical
  void callMethodOnExpensiveClass(ExpensiveClass c) {
    c.anExpensiveMethod();
  }

  public void annotatedPerformanceCriticalInInterface() {
    mOther.callsExpensive1();
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
    }
  }

  // Introduced unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is unreachable code");
    }
  }

  private boolean getCondition() {
    return false;
  }
}