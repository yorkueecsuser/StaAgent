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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void performanceCriticalMethod2(Other o) {
    o.expensive(); // should report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void performanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void performanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }
}

class ExpensiveSubclass extends ExpensiveClass {

  void anotherExpensiveMethod() {}
}

class PerformanceCriticalSubclass extends PerformanceCriticalClass {

  void subclassPerformanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void subclassPerformanceCriticalMethod2(ExpensiveSubclass c) {
    c.anotherExpensiveMethod(); // should report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void subclassPerformanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void subclassPerformanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void methodWrapper() {
    expensiveMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  void notCallingExpensiveMethod() {
    nonExpensiveMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  void directlyCallingExpensiveMethod() {
    expensiveMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  void indirectlyCallingExpensiveMethod() {
    methodWrapper();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  void callingExpensiveMethodFromInterface(ExpensiveInterfaceExample object) {
    object.m5();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  void callsExpensive2() {
    mOther.callsExpensive1();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  void longerCallStackToExpensive() {
    callsExpensive2();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromView(ImageView view, int id) {
    return view.findViewById(id);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromActivity(FragmentActivity activity, int id) {
    return activity.findViewById(id);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  @PerformanceCritical
  void callMethodOnExpensiveClass(ExpensiveClass c) {
    c.anExpensiveMethod();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  public void annotatedPerformanceCriticalInInterface() {
    mOther.callsExpensive1();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}