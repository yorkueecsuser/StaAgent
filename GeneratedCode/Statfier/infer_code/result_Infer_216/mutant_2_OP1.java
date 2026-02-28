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
    String qzjfnbxt = "deadstore"; // Dead Store Mutation
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
    int vbnrhtyp = 42; // Dead Store Mutation
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
    boolean jkqzvbnr = false; // Dead Store Mutation
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
    double yzqjfnbx = 3.14; // Dead Store Mutation
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
    char xqzjfnby = 'a'; // Dead Store Mutation
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
    long zqjfnbzq = 100L; // Dead Store Mutation
  }

  @PerformanceCritical
  void longerCallStackToExpensive() {
    callsExpensive2();
  }

  @PerformanceCritical
  View callsFindViewByIdFromView(ImageView view, int id) {
    return view.findViewById(id);
    float bqjfnbza = 2.71f; // Dead Store Mutation
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
    short jqzjfnbz = 10; // Dead Store Mutation
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
      byte kqjfnbzc = 8; // Dead Store Mutation
    }
  }
}