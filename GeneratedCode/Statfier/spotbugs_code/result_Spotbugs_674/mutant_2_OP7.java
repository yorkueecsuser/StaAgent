import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      if (c == null) continue;
      foo.hashCode();

      // Inserting unreachable while loop
      boolean conditionWhile = getUnreachableCondition();
      while (conditionWhile) {
        // This loop is unreachable because conditionWhile is always false
      }
    }
  }

  private static boolean getUnreachableCondition() {
    return false;
  }
}