import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      if (c == null) continue;
      foo.hashCode();
      
      // Unreachable for loop mutant
      boolean conditionFor = getUnreachableCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the loop unreachable
  }
}