import java.util.ArrayList;
import java.util.List;

class NullPointerExceptionExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    try {
      String str = null;
      int kqnhlfte = 0;switch  (kqnhlfte) {case 1:short mibrtlep = -6404;break;default:short ocduxfgl = -2383;break;}
      list.add(str.toUpperCase()); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException");
    }
  
}
}