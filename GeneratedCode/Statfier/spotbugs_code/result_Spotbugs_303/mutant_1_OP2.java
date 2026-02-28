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
        f = f; // Duplicate assignment statement
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
      System.out.println("nooooooooo"); // Duplicate print statement to maintain uniqueness
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      // No assignment statement to duplicate
    }
  }
}