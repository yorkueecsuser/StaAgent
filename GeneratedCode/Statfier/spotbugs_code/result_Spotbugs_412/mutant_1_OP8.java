import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

class DontBeMalicious {

  static final HashMap myMap = new HashMap();

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
  }

  public void lazyMethod() {
    try {
      BufferedReader x = new BufferedReader(new FileReader("HelloHello"));
    } catch (FileNotFoundException e) {
    }
    
    // Mutated code
    try {
      BufferedReader y = new BufferedReader(new FileReader("HelloHello"));
    } catch (FileNotFoundException f) {
    }
  }
}