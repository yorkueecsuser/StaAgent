import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashSet;
import java.util.Set;

class Ideas_2009_05_14 {
  static <E> Set<E> newHashSet() {
    return new HashSet<E>();
  }

  static <E> Set<E> newHashSet(int x) {
    return new HashSet<E>();
  }

  static Set<String> foo, bar;

  static String huh;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setFoo() {
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      foo.add("unreachable");
    } else {
      // Another unreachable code
      foo.add("another unreachable");
    }
  }

  @DesireWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setFooAndHuh() {
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
    huh = "huh";
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      huh = "unreachable";
    } else {
      // Another unreachable code
      huh = "another unreachable";
    }
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getFoo() {
    int x = 1;
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      foo.add("unreachable");
    } else {
      // Another unreachable code
      foo.add("another unreachable");
    }
    return foo;
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getFaz() {
    if (foo == null) {
      foo = newHashSet(1);
      foo.add("a");
      foo.add("b");
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      foo.add("unreachable");
    } else {
      // Another unreachable code
      foo.add("another unreachable");
    }
    return foo;
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getBar() {
    if (bar == null) {
      bar = new HashSet<String>();
      bar.add("a");
      bar.add("b");
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      bar.add("unreachable");
    } else {
      // Another unreachable code
      bar.add("another unreachable");
    }
    return bar;
  }

  private static boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}