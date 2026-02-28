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
      // Mutant: Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  class Child extends Parent {
    @Override
    protected void finalize() {
      System.out.println("nooooooooo");
      // Mutant: Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is another unreachable statement");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      // Mutant: Inserting an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Yet another unreachable statement");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}