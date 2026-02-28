import java.io.IOException;
import java.io.InputStream;

class Finalizer {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  class Parent {
    InputStream f;
    InputStream g; // Added for mutation

    @Override
    protected void finalize() {
      // System.out.println("I'M MEEELLLLTTTTINNNNGGGGG");
      try {
        f.close();
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
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {}
  }

  class MutatedParent extends Parent {
    InputStream h; // Added for mutation

    @Override
    protected void finalize() {
      // System.out.println("I'M MEEELLLLTTTTINNNNGGGGG");
      try {
        h.close(); // Mutated variable
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}