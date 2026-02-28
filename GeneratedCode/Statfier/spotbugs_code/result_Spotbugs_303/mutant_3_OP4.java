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
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This will never be printed because condition is always false");
      } else {
        System.out.println("This will also never be printed because condition is always false");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }
  }

  class Child extends Parent {
    @Override
    protected void finalize() {
      System.out.println("nooooooooo");
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This will never be printed because condition is always false");
      } else {
        System.out.println("This will also never be printed because condition is always false");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This will never be printed because condition is always false");
      } else {
        System.out.println("This will also never be printed because condition is always false");
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }
  }
}