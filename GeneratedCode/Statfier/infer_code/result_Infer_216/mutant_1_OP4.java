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
    if (condition) {
      // Some code
    } else {
      // Unreachable code
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
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void performanceCriticalMethod2(Other o) {
    o.expensive(); // should report
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void performanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void performanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
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
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void subclassPerformanceCriticalMethod2(ExpensiveSubclass c) {
    c.anotherExpensiveMethod(); // should report
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void subclassPerformanceCriticalMethod3(Other o) {
    o.callsExpensive1(); // should report
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void subclassPerformanceCriticalMethod4(Other o) {
    o.inexpensiveMethod(); // should not report
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
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
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void methodWrapper() {
    expensiveMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void notCallingExpensiveMethod() {
    nonExpensiveMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void directlyCallingExpensiveMethod() {
    expensiveMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void indirectlyCallingExpensiveMethod() {
    methodWrapper();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void callingExpensiveMethodFromInterface(ExpensiveInterfaceExample object) {
    object.m5();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  void callsExpensive2() {
    mOther.callsExpensive1();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void longerCallStackToExpensive() {
    callsExpensive2();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromView(ImageView view, int id) {
    return view.findViewById(id);
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  View callsFindViewByIdFromActivity(FragmentActivity activity, int id) {
    return activity.findViewById(id);
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  @PerformanceCritical
  void callMethodOnExpensiveClass(ExpensiveClass c) {
    c.anExpensiveMethod();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  public void annotatedPerformanceCriticalInInterface() {
    mOther.callsExpensive1();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  native boolean test();

  @PerformanceCritical
  void callsExpensiveInConditionalBranch() {
    if (test()) {
      expensiveMethod();
    }
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method can be used to simulate a dynamic condition
  }
}