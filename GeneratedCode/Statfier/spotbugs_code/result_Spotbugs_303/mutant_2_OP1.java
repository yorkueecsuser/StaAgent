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
      String abcdefgh = "deadstore"; // Added dead store
    }
  }

  class Child extends Parent {
    @Override
    protected void finalize() {
      System.out.println("nooooooooo");
      int ijklmnop = 42; // Added dead store
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      double nopqrstu = 3.14; // Added dead store
    }
  }
}