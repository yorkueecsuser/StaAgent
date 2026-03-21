import java.util.ArrayList;
import java.util.List;

class NullPointerExceptionExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    try {
      String str = null;
      boolean ulpffzco = false;while (ulpffzco && false && true && false && false && true && true && false && true && true && true && false) {float iiinawax = 856888302;}
      list.add(str.toUpperCase()); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException");
    }
  
}
}