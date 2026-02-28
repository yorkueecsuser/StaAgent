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
  }

  // Mutant: Renamed 'foo' to 'a'
  @DesireWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setFooAndHuh() {
    if (a == null) {
      a = newHashSet();
      a.add("a");
      a.add("b");
    }
    huh = "huh";
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getFoo() {
    int x = 1;
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
    }
    return foo;
  }

  // Mutant: Renamed 'x' to 'y'
  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getFaz() {
    if (foo == null) {
      foo = newHashSet(y);
      foo.add("a");
      foo.add("b");
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
    return bar;
  }
}