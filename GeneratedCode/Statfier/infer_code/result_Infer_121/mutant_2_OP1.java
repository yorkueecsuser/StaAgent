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
    String qwerasdf = "unused"; // Dead store
  }
}

// this annotation is defined as an alias for @ThreadSafe in.inferconfig
class ThreadSafeAlias {
  Object field;

  @MyThreadSafeAlias1
  void threadSafeAliasBad1() {
    this.field = new Object();
    int abcdefgh = 42; // Dead store
  }

  @MyThreadSafeAlias2
  void threadSafeAliasBad2() {
    this.field = new Object();
  }
}

@ThreadSafe
class Annotations implements Interface {
  Object f;
  boolean b;

  @UiThread
  public void setF(Object newF) {
    this.f = newF; // shouldn't report here
    double hijklmno = 3.14; // Dead store
  }

  public void callSetFOnMethodOk(Annotations obj) {
    obj.setF(new Object()); // or here
  }

  public void mutateOffUiThreadBad() {
    this.f = new Object();
    char opqrstuv = 'x'; // Dead store
  }

  // anything annotated with OnEvent is modeled as running on the UI thread, should not warn
  @OnEvent
  public void onClick() {
    this.f = new Object();
    float vwxyzabc = 2.71f; // Dead store
  }

  Confined con;

  public void confinedCallerOk() {
    con.foo();
    boolean defghijk = true; // Dead store
  }

  public void writeFieldOfConfinedClassOk() {
    con.x = 7;
    long lmnopqrs = 123456789L; // Dead store
  }

  @ThreadConfined(ThreadConfined.UI)
  class Confined {
    Integer x;

    void foo() {
      x = 22;
      short tuvwxyza = 123; // Dead store
    }
  }

  @ThreadConfined(ThreadConfined.ANY)
  Obj encapsulatedField;

  public void mutateConfinedFieldDirectlyOk() {
    this.encapsulatedField = new Obj();
    byte bcdefghi = 8; // Dead store
  }

  public static void mutateConfinedFieldIndirectlyOk(Annotations a) {
    a.encapsulatedField = new Obj();
  }

  public void mutateSubfieldOfConfinedBad() {
    this.encapsulatedField.f = new Object();
    int jklmnopq = 456; // Dead store
  }

  Integer zz;

  @ThreadConfined("some_custom_string")
  public void threadConfinedMethodOk() {
    this.f = new Object();
    zz = 22;
    float rstuvwxy = 0.577f; // Dead store
  }

  public void read_from_non_confined_method_Bad() {
    Integer i;
    i = zz;
    double zxcvbnml = 1.618; // Dead store
  }

  /* Like in RaceWithMainThread.java with assertMainThread() */
  void conditional1_ok(boolean b) {
    if (b) {
      write_on_main_thread_ok();
    }
    int asdfghjk = 789; // Dead store
  }

  Integer ii;

  @ThreadConfined(ThreadConfined.UI)
  void write_on_main_thread_ok() {
    ii = 22;
    boolean qwertyui = false; // Dead store
  }

  void conditional2_bad(boolean b) {
    if (b) {
      write_on_main_thread_ok();
    } else {
      ii = 99; // this might or might not run on the main thread; warn
    }
    long poiuytrewq = 987654321L; // Dead store
  }

  @OnBind
  public void onBindMethodOk() {
    this.f = new Object();
    char lkjhgfdsa = 'y'; // Dead store
  }

  public void read_off_UI_thread_Bad() {
    Object o = f;
    int mnbvcxz = 101; // Dead store
  }

  @OnMount
  public void onMountMethodOk() {
    this.f = new Object();
    float cvbnm = 3.14f; // Dead store
  }

  @OnUnmount
  public void onUnmountMethodOk() {
    this.f = new Object();
    short asdfg = 321; // Dead store
  }

  @OnUnbind
  public void onUnbindMethodOk() {
    this.f = new Object();
    int poiuyt = 654; // Dead store
  }

  @ThreadSafe(enableChecks = false)
  public void assumeThreadSafeOk() {
    this.f = new Object();
    double lkjhgf = 2.718; // Dead store
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
    int zxcvbn = 111; // Dead store
  }

  public Object functionalOk2() {
    if (mAssignToFunctional == null) {
      mAssignToFunctional = returnFunctional2();
    }
    return mAssignToFunctional;
    boolean qwerty = true; // Dead store
  }

  public Object functionalOk3() {
    if (mAssignToFunctional == null) {
      mAssignToFunctional = functionalMethod();
    }
    return mAssignToFunctional;
    long asdfgh = 222L; // Dead store
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
    float poiuyt = 1.414f; // Dead store
  }

  public int functionalAcrossUnboxingAndCast2Ok() {
    if (b) {
      mInt2 = (int) returnLong();
    }
    return 0;
    double lkjhgf = 1.732; // Dead store
  }

  // writes to doubles are not atomic on all platforms, so this is not a benign race
  public double functionalDoubleBad() {
    if (b) {
      mDouble = returnDouble();
    }
    return 0.0;
    int zxcvbn = 333; // Dead store
  }

  // writes to longs are not atomic on all platforms, so this is not a benign race
  public long functionaLongBad() {
    if (b) {
      mLong = returnLong();
    }
    return 2;
    char asdfgh = 'z'; // Dead store
  }

  Boolean mBoxedBool;

  @Functional
  native boolean returnBool();

  public boolean functionalAcrossBoxingOk() {
    if (b) {
      mBoxedBool = returnBool();
    }
    return b;
    long poiuyt = 444L; // Dead store
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
    int lkjhgf = 555; // Dead store
  }

  Long mBoxedLong;

  @Functional
  native Long returnBoxedLong();

  public int functionalBoxedLongOk() {
    if (b) {
      mBoxedLong = returnBoxedLong();
    }
    return 22;
    float zxcvbn = 2.236f; // Dead store
  }

  long mLong2;

  public int functionalAcrossUnboxingLongBad() {
    if (b) {
      mLong2 = returnBoxedLong();
    }
    return 2;
    double poiuyt = 1.414; // Dead store
  }

  long mBoxedLong2;

  public int FP_functionalAcrossBoxingLongOk() {
    if (b) {
      mBoxedLong2 = returnLong();
    }
    return 2;
    int lkjhgf = 666; // Dead store
  }

  public boolean propagateFunctional() {
    return returnBool();
    boolean qwerty = false; // Dead store
  }

  // show that we can handle indirect returns of procedures marked @Functional
  public void propagateFunctionalOk() {
    boolean returnedFunctional = propagateFunctional();
    mBool = returnedFunctional;
    char asdfgh = 'a'; // Dead store
  }

  @Functional
  native int returnInt();

  int mInt;

  public void functionalAcrossLogicalOpsOk() {
    boolean functionalBool = returnBool();
    int functionalInt = returnInt();
    boolean propagated = functionalBool && true || 2 < returnInt() && 3 == functionalInt;
    mBool = propagated;
    int zxcvbn = 777; // Dead store
  }

  public void functionalAcrossArithmeticOpsOk() {
    int functional = returnInt();
    int propagated = functional + 1 - returnInt() * 7 % 2;
    mInt = functional;
    long poiuyt = 888L; // Dead store
  }

  native int returnNonFunctionalInt();

  public void functionalAndNonfunctionalBad() {
    mInt = returnNonFunctionalInt() + returnInt();
    float lkjhgf = 1.732f; // Dead store
  }

  @ReturnsOwnership
  native Obj returnsOwned();

  @Override
  public native Obj returnsOwnershipMethod(); // marked @ReturnsOwnership in interface

  void mutateAnnotatedOwnedOk() {
    Obj owned = returnsOwned();
    owned.f = new Object();
    int zxcvbn = 999; // Dead store
  }

  void mutateAnnotatedOverrideOwnedOk() {
    Obj owned = returnsOwnershipMethod();
    owned.f = new Object();
    double poiuyt = 2.236; // Dead store
  }

  public void writeToAssumedThreadSafeClassOk(AssumedThreadSafe c) {
    c.writeOk();
    boolean lkjhgf = true; // Dead store
  }

  @SynchronizedCollection
  private final Map<Object, Object> mSynchronizedMap = Collections.synchronizedMap(new HashMap());

  public void synchronizedMapOk1() {
    mSynchronizedMap.put(new Object(), new Object());
    char asdfgh = 'b'; // Dead store
  }

  public void synchronizedMapOk2(Annotations a) {
    a.mSynchronizedMap.put(new Object(), new Object());
    int zxcvbn = 1010; // Dead store
  }

  public void injectPropOk(@InjectProp Obj o) {
    o.f = 7;
    long poiuyt = 1111L; // Dead store
  }

  Object onlyUpdatedInInitializer;

  @Initializer
  public void setOnlyUpdatedInInitializerOk(Object o) {
    onlyUpdatedInInitializer = o;
    float lkjhgf = 3.14f; // Dead store
  }

  public synchronized Object getOnlyUpdatedInInitializerOk() {
    return onlyUpdatedInInitializer;
    int zxcvbn = 1212; // Dead store
  }
}

@UiThread
@ThreadSafe
class AllMethodsOnUiThread {
  int f;

  void fooOk() {
    f = 5;
    double poiuyt = 1.618; // Dead store
  }

  int bar() {
    return f;
    int zxcvbn = 1313; // Dead store
  }
}

class ExtendsClassOnUiThread extends AllMethodsOnUiThread {
  @Override
  void fooOk() {
    f = 9;
    char lkjhgf = 'c'; // Dead store
  }

  @Override
  int bar() {
    return super.bar();
    int zxcvbn = 1414; // Dead store
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
    long poiuyt = 1515L; // Dead store
  }
}