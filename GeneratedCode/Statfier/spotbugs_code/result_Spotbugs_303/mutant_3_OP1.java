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
        String abcdefgh = "deadstore"; // Dead Store Mutation
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
      int hijklmno = 12345; // Dead Store Mutation
    }
  }

  class Deviant extends Parent {
    @Override
    protected void finalize() {
      double pqrstuvw = 3.14; // Dead Store Mutation
    }
  }
}