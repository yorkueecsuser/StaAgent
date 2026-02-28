import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      if (c == null) continue;
      foo.hashCode();
    }

    // Mutant code with renamed variable
    for (Ideas_2009_05_04 x : c) {
      Object bar = x.getFoo();
      if (c == null) continue;
      bar.hashCode();
    }
  }
}