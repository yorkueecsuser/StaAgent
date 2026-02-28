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
        f = f; // Mutant: duplicated assignment statement
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  class Child extends Parent {
    @Override
    protected void finalize() {
      System.out.println("nooooooooo");
      System.out.println("nooooooooo"); // Mutant: duplicated print statement, but not an assignment
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      // No applicable assignment statement to duplicate
    }
  }
}