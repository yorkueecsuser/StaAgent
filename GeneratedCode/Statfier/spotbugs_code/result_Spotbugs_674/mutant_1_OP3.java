import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      if (c == null) continue;

      // Inserting an unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
      }

      foo.hashCode();
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}