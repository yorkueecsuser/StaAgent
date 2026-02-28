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

  @DesireWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setFooAndHuh() {
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
    if (foo == null) {
      foo = newHashSet();
      foo.add("a");
      foo.add("b");
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

  // Mutated code
  static <E> Set<E> newHashSetX() {
    return new HashSet<E>();
  }

  static <E> Set<E> newHashSetY(int y) {
    return new HashSet<E>();
  }

  static Set<String> qux, corge;

  static String grault;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setQux() {
    if (qux == null) {
      qux = newHashSetX();
      qux.add("a");
      qux.add("b");
    }
  }

  @DesireWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static void setQuxAndGrault() {
    if (qux == null) {
      qux = newHashSetX();
      qux.add("a");
      qux.add("b");
    }
    grault = "grault";
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getQux() {
    int z = 1;
    if (qux == null) {
      qux = newHashSetX();
      qux.add("a");
      qux.add("b");
    }
    return qux;
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getGarply() {
    if (qux == null) {
      qux = newHashSetY(1);
      qux.add("a");
      qux.add("b");
    }
    return qux;
  }

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC")
  static Set<String> getCorge() {
    if (corge == null) {
      corge = new HashSet<String>();
      corge.add("a");
      corge.add("b");
    }
    return corge;
  }
}