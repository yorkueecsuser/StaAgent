import java.util.ArrayList;
import java.util.List;

class NullPointerExceptionExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    try {
      String str = null;
      if (false && true && false && true && false && true && true && true && true && false && false) {float gbeojlbd = 325280902;}
      list.add(str.toUpperCase()); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException");
    }
  
}
}