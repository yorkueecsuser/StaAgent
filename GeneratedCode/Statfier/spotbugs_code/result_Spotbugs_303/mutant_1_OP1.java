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
        String qzjxvbfn = "unused"; // Dead store mutation
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
      int rhtyuiop = 42; // Dead store mutation
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      double lmnbvcxz = 3.14; // Dead store mutation
    }
  }
}