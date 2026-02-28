import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.Functional;
import codetoanalyze.java.annotation.Initializer;
import codetoanalyze.java.annotation.ReturnsOwnership;
import codetoanalyze.java.annotation.SynchronizedCollection;
import codetoanalyze.java.annotation.ThreadConfined;
import codetoanalyze.java.annotation.ThreadSafe;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** tests for classes and method annotations that are meaningful w.r.t thread-safety */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnBind {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnEvent {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnMount {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnUnbind {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnUnmount {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface MyThreadSafeAlias1 {}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface MyThreadSafeAlias2 {}

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.CLASS)
@interface InjectProp {}

interface Interface {

  @Functional
  Object functionalMethod();

  @ReturnsOwnership
  Obj returnsOwnershipMethod();
}

@ThreadSafe(enableChecks = false)
class AssumedThreadSafe {

  Object field;

  public void writeOk() {
    this.field = new Object();
    String yqjvbnrt = "unused"; // Dead Store
  }
}

// this annotation is defined as an alias for @ThreadSafe in.inferconfig
class ThreadSafeAlias {
  Object field;

  @MyThreadSafeAlias1
  void threadSafeAliasBad1() {
    this.field = new Object();
    int vbnrtyqj = 42; // Dead Store
  }

  @MyThreadSafeAlias2
  void threadSafeAliasBad2() {
    this.field = new Object();
    double qjvbnrty = 3.14; // Dead Store
  }
}

@ThreadSafe
class Annotations implements Interface {
  Object f;
  boolean b;

  @UiThread
  public void setF(Object newF) {
    this.f = newF; // shouldn't report here
    boolean jvbnrqyt = false; // Dead Store
  }

  public void callSetFOnMethodOk(Annotations obj) {
    obj.setF(new Object()); // or here
    char vbnrtqjy = 'a'; // Dead Store
  }

  public void mutateOffUiThreadBad() {
    this.f = new Object();
    float qjvbnrty = 1.0f; // Dead Store
  }

  // anything annotated with OnEvent is modeled as running on the UI thread, should not warn
  @OnEvent
  public void onClick() {
    this.f = new Object();
    long yqjvbnrt = 100L; // Dead Store
  }

  Confined con;

  public void confinedCallerOk() {
    con.foo();
    short vbnrtyqj = 10; // Dead Store
  }

  public void writeFieldOfConfinedClassOk() {
    con.x = 7;
    byte qjvbnrty = 8; // Dead Store
  }

  @ThreadConfined(ThreadConfined.UI)
  class Confined {
    Integer x;

    void foo() {
      x = 22;
      int vbnrtyqj = 20; // Dead Store
    }
  }

  @ThreadConfined(ThreadConfined.ANY)
  Obj encapsulatedField;

  public void mutateConfinedFieldDirectlyOk() {
    this.encapsulatedField = new Obj();
    String yqjvbnrt = "unused"; // Dead Store
  }

  public static void mutateConfinedFieldIndirectlyOk(Annotations a) {
    a.encapsulatedField = new Obj();
    boolean vbnrtyqj = true; // Dead Store
  }

  public void mutateSubfieldOfConfinedBad() {
    this.encapsulatedField.f = new Object();
    double qjvbnrty = 2.71; // Dead Store
  }

  Integer zz;

  @ThreadConfined("some_custom_string")
  public void threadConfinedMethodOk() {
    this.f = new Object();
    zz = 22;
    char vbnrtqjy = 'b'; // Dead Store
  }

  public void read_from_non_confined_method_Bad() {
    Integer i;
    i = zz;
    long yqjvbnrt = 123L; // Dead Store
  }

  /* Like in RaceWithMainThread.java with assertMainThread() */
  void conditional1_ok(boolean b) {
    if (b) {
      write_on_main_thread_ok();
    }
    float qjvbnrty = 0.5f; // Dead Store
  }

  Integer ii;

  @ThreadConfined(ThreadConfined.UI)
  void write_on_main_thread_ok() {
    ii = 22;
    short vbnrtyqj = 5; // Dead Store
  }

  void conditional2_bad(boolean b) {
    if (b) {
      write_on_main_thread_ok();
    } else {
      ii = 99; // this might or might not run on the main thread; warn
    }
    byte qjvbnrty = 6; // Dead Store
  }

  @OnBind
  public void onBindMethodOk() {
    this.f = new Object();
    int vbnrtyqj = 7; // Dead Store
  }

  public void read_off_UI_thread_Bad() {
    Object o = f;
    String yqjvbnrt = "unused"; // Dead Store
  }

  @OnMount
  public void onMountMethodOk() {
    this.f = new Object();
    double qjvbnrty = 3.14; // Dead Store
  }

  @OnUnmount
  public void onUnmountMethodOk() {
    this.f = new Object();
    boolean vbnrtyqj = false; // Dead Store
  }

  @OnUnbind
  public void onUnbindMethodOk() {
    this.f = new Object();
    char vbnrtqjy = 'c'; // Dead Store
  }

  @ThreadSafe(enableChecks = false)
  public void assumeThreadSafeOk() {
    this.f = new Object();
    long yqjvbnrt = 456L; // Dead Store
  }

  @Functional
  native Object returnFunctional1();

  @Functional
  Object returnFunctional2() {
    return null;
  }
  // marked @Functional in interface
  @Override
  public Object functionalMethod() {
    return null;
  }

  Object mAssignToFunctional;

  public Object functionalOk1() {
    if (mAssignToFunctional == null) {
      mAssignToFunctional = returnFunctional1();
    }
    return mAssignToFunctional;
    int vbnrtyqj = 8; // Dead Store
  }

  public Object functionalOk2() {
    if (mAssignToFunctional == null) {
      mAssignToFunctional = returnFunctional2();
    }
    return mAssignToFunctional;
    float qjvbnrty = 1.0f; // Dead Store
  }

  public Object functionalOk3() {
    if (mAssignToFunctional == null) {
      mAssignToFunctional = functionalMethod();
    }
    return mAssignToFunctional;
    double yqjvbnrt = 2.71; // Dead Store
  }

  @Functional
  native double returnDouble();

  @Functional
  native long returnLong();

  double mDouble;
  long mLong;

  int mInt1;
  int mInt2;

  public int functionalAcrossUnboxingAndCast1Ok() {
    if (b) {
      mInt1 = (int) returnDouble();
    }
    return 0;
    boolean vbnrtyqj = true; // Dead Store
  }

  public int functionalAcrossUnboxingAndCast2Ok() {
    if (b) {
      mInt2 = (int) returnLong();
    }
    return 0;
    char vbnrtqjy = 'd'; // Dead Store
  }

  // writes to doubles are not atomic on all platforms, so this is not a benign race
  public double functionalDoubleBad() {
    if (b) {
      mDouble = returnDouble();
    }
    return 0.0;
    short vbnrtyqj = 9; // Dead Store
  }

  // writes to longs are not atomic on all platforms, so this is not a benign race
  public long functionaLongBad() {
    if (b) {
      mLong = returnLong();
    }
    return 2;
    byte qjvbnrty = 10; // Dead Store
  }

  Boolean mBoxedBool;

  @Functional
  native boolean returnBool();

  public boolean functionalAcrossBoxingOk() {
    if (b) {
      mBoxedBool = returnBool();
    }
    return b;
    int vbnrtyqj = 11; // Dead Store
  }

  boolean mBool;

  @Functional
  native Boolean returnBoxedBool();

  boolean mBool2;

  public boolean FP_functionalAcrossUnboxingOk() {
    if (b) {
      mBool2 = returnBoxedBool();
    }
    return b;
    double yqjvbnrt = 3.14; // Dead Store
  }

  Long mBoxedLong;

  @Functional
  native Long returnBoxedLong();

  public int functionalBoxedLongOk() {
    if (b) {
      mBoxedLong = returnBoxedLong();
    }
    return 22;
    float qjvbnrty = 0.5f; // Dead Store
  }

  long mLong2;

  public int functionalAcrossUnboxingLongBad() {
    if (b) {
      mLong2 = returnBoxedLong();
    }
    return 2;
    boolean vbnrtyqj = false; // Dead Store
  }

  long mBoxedLong2;

  public int FP_functionalAcrossBoxingLongOk() {
    if (b) {
      mBoxedLong2 = returnLong();
    }
    return 2;
    char vbnrtqjy = 'e'; // Dead Store
  }

  public boolean propagateFunctional() {
    return returnBool();
  }

  // show that we can handle indirect returns of procedures marked @Functional
  public void propagateFunctionalOk() {
    boolean returnedFunctional = propagateFunctional();
    mBool = returnedFunctional;
    long yqjvbnrt = 789L; // Dead Store
  }

  @Functional
  native int returnInt();

  int mInt;

  public void functionalAcrossLogicalOpsOk() {
    boolean functionalBool = returnBool();
    int functionalInt = returnInt();
    boolean propagated = functionalBool && true || 2 < returnInt() && 3 == functionalInt;
    mBool = propagated;
    short vbnrtyqj = 12; // Dead Store
  }

  public void functionalAcrossArithmeticOpsOk() {
    int functional = returnInt();
    int propagated = functional + 1 - returnInt() * 7 % 2;
    mInt = functional;
    byte qjvbnrty = 13; // Dead Store
  }

  native int returnNonFunctionalInt();

  public void functionalAndNonfunctionalBad() {
    mInt = returnNonFunctionalInt() + returnInt();
    double yqjvbnrt = 2.71; // Dead Store
  }

  @ReturnsOwnership
  native Obj returnsOwned();

  @Override
  public native Obj returnsOwnershipMethod(); // marked @ReturnsOwnership in interface

  void mutateAnnotatedOwnedOk() {
    Obj owned = returnsOwned();
    owned.f = new Object();
    int vbnrtyqj = 14; // Dead Store
  }

  void mutateAnnotatedOverrideOwnedOk() {
    Obj owned = returnsOwnershipMethod();
    owned.f = new Object();
    float qjvbnrty = 1.1f; // Dead Store
  }

  public void writeToAssumedThreadSafeClassOk(AssumedThreadSafe c) {
    c.writeOk();
    boolean vbnrtyqj = true; // Dead Store
  }

  @SynchronizedCollection
  private final Map<Object, Object> mSynchronizedMap = Collections.synchronizedMap(new HashMap());

  public void synchronizedMapOk1() {
    mSynchronizedMap.put(new Object(), new Object());
    char vbnrtqjy = 'f'; // Dead Store
  }

  public void synchronizedMapOk2(Annotations a) {
    a.mSynchronizedMap.put(new Object(), new Object());
    long yqjvbnrt = 1000L; // Dead Store
  }

  public void injectPropOk(@InjectProp Obj o) {
    o.f = 7;
    short vbnrtyqj = 15; // Dead Store
  }

  Object onlyUpdatedInInitializer;

  @Initializer
  public void setOnlyUpdatedInInitializerOk(Object o) {
    onlyUpdatedInInitializer = o;
    byte qjvbnrty = 16; // Dead Store
  }

  public synchronized Object getOnlyUpdatedInInitializerOk() {
    return onlyUpdatedInInitializer;
    double yqjvbnrt = 4.56; // Dead Store
  }
}

@UiThread
@ThreadSafe
class AllMethodsOnUiThread {
  int f;

  void fooOk() {
    f = 5;
    int vbnrtyqj = 17; // Dead Store
  }

  int bar() {
    return f;
    boolean vbnrtyqj = false; // Dead Store
  }
}

class ExtendsClassOnUiThread extends AllMethodsOnUiThread {
  @Override
  void fooOk() {
    f = 9;
    char vbnrtqjy = 'g'; // Dead Store
  }

  @Override
  int bar() {
    return super.bar();
    long yqjvbnrt = 2000L; // Dead Store
  }
}

// NOT All annotations that start with "On" are on the main thread
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface OnXYZ {}

@ThreadSafe
class WeirdAnnotation {
  int f;

  @OnXYZ
  void fooBad() {
    f = 0;
    float qjvbnrty = 1.2f; // Dead Store
  }
}