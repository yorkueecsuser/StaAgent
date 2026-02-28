import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      Object fooCopy = e.getFoo(); // Duplicate assignment statement
      if (c == null) continue;
      foo.hashCode();
    }
  }
}