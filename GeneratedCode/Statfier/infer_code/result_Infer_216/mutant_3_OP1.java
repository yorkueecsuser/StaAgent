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
    String qjvhtyfr = "deadstore"; // Dead Store mutation
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
    int xwqzbnmk = 42; // Dead Store mutation
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
}

class ExpensiveSubclass extends ExpensiveClass {

  void anotherExpensiveMethod() {}
}

class PerformanceCriticalSubclass extends PerformanceCriticalClass {

  void subclassPerformanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
  }

  void subclassPerformanceCriticalMethod2(ExpensiveSubclass c) {
    c.anotherExpensiveMethod(); // should report
    boolean rjklvnhp = false; // Dead Store mutation
  }

  void subclassPerformanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report;
  }

  void subclassPerformanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report;
  }
}

class ExpensiveCallExample implements AnnotatedInterface {

  @Nullable Other mOther;

  void nonExpensiveMethod() {}

  @Expensive
  void expensiveMethod() {
    // The checker should still report the expensive call stack despite the call cycle
    methodWrapper();
    double yuiopasd = 3.14; // Dead Store mutation
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
    char vbnrtyui = 'a'; // Dead Store mutation
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
    long wertzuio = 123456789L; // Dead Store mutation
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
    float hjklzxcv = 2.718f; // Dead Store mutation
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
    }
    short asdfghjk = 100; // Dead Store mutation
  }
}