import java.util.Collection;

public abstract class Ideas_2009_05_04 {

  abstract Object getFoo();

  public static void foo(Collection<Ideas_2009_05_04> c) {

    for (Ideas_2009_05_04 e : c) {
      Object foo = e.getFoo();
      if (c == null) continue;
      foo.hashCode();
      
      // Inserted unreachable for loop
      boolean conditionFor = getUnreachableCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable
        System.out.println("This loop is unreachable");
      }
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the loop unreachable
  }
}