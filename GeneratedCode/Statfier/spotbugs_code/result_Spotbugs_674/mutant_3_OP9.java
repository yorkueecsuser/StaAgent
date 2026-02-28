import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    Ideas_2009_05_04[] array = c.toArray(new Ideas_2009_05_04[0]);
    int i = 0;
    do {
      if (i >= array.length) break;
      Ideas_2009_05_04 e = array[i];
      Object foo = e.getFoo();
      if (c == null) continue;
      foo.hashCode();
      i++;
    } while (true);
  }
}