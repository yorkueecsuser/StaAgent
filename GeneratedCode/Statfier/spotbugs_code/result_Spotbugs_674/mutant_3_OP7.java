import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      if (c == null) continue;
      
      // Inserting an unreachable while loop
      boolean conditionWhile = getUnreachableCondition();
      while (conditionWhile) {
        // This loop is unreachable
        System.out.println("This loop is unreachable");
      }

      foo.hashCode();
    }
  }

  // Method to provide a dynamic but always false condition
  private static boolean getUnreachableCondition() {
    return false;
  }
}