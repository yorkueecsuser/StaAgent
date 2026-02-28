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
      // Mutant code: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  class Child extends Parent {
    @Override
    protected void finalize() {
      System.out.println("nooooooooo");
      // Mutant code: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is another unreachable if statement");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      // Mutant code: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Yet another unreachable if statement");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}