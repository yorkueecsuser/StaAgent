import java.io.IOException;
import java.io.InputStream;

class Finalizer {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  class Parent {
    InputStream f;

    @Override
    protected void finalize() {
      // System.out.println("I'M MEEELLLLTTTTINNNNGGGGG");
      try {
        f.close();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      // Mutant code added here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable
        System.out.println("This block is reachable");
      } else {
        // This block is unreachable
        System.out.println("This block is unreachable");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the first block is reachable
    }
  }

  class Child extends Parent {
    @Override
    protected void finalize() {
      System.out.println("nooooooooo");
      // Mutant code added here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable
        System.out.println("This block is reachable in Child");
      } else {
        // This block is unreachable
        System.out.println("This block is unreachable in Child");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the first block is reachable
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      // Mutant code added here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable
        System.out.println("This block is reachable in Deviant");
      } else {
        // This block is unreachable
        System.out.println("This block is unreachable in Deviant");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the first block is reachable
    }
  }
}