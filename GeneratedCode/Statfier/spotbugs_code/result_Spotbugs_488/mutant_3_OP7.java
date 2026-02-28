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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
  }

  @DesireWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setFooAndHuh() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
    huh = "huh";
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getFoo() {
    int x = 1;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
    return foo;
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getFaz() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    if (foo == null) {
      foo = newHashSet(1);
      foo.add("a");
      foo.add("b");
    }
    return foo;
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getBar() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    if (bar == null) {
      bar = new HashSet<String>();
      bar.add("a");
      bar.add("b");
    }
    return bar;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}