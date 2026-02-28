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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void performanceCriticalMethod2(Other o) {
    o.expensive(); // should report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void performanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void performanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }
}

class ExpensiveSubclass extends ExpensiveClass {

  void anotherExpensiveMethod() {}
}

class PerformanceCriticalSubclass extends PerformanceCriticalClass {

  void subclassPerformanceCriticalMethod1(ExpensiveClass c) {
    c.anExpensiveMethod(); // should report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void subclassPerformanceCriticalMethod2(ExpensiveSubclass c) {
    c.anotherExpensiveMethod(); // should report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void subclassPerformanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void subclassPerformanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void methodWrapper() {
    expensiveMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  void notCallingExpensiveMethod() {
    nonExpensiveMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  void directlyCallingExpensiveMethod() {
    expensiveMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  void indirectlyCallingExpensiveMethod() {
    methodWrapper();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  void callingExpensiveMethodFromInterface(ExpensiveInterfaceExample object) {
    object.m5();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  void callsExpensive2() {
    mOther.callsExpensive1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  void longerCallStackToExpensive() {
    callsExpensive2();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromView(ImageView view, int id) {
    return view.findViewById(id);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromActivity(FragmentActivity activity, int id) {
    return activity.findViewById(id);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  @PerformanceCritical
  void callMethodOnExpensiveClass(ExpensiveClass c) {
    c.anExpensiveMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  public void annotatedPerformanceCriticalInInterface() {
    mOther.callsExpensive1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
    } else {
      // This is an unreachable block due to getCondition() always returning false
    }
  }

  private boolean getCondition() {
    return false;
  }
}