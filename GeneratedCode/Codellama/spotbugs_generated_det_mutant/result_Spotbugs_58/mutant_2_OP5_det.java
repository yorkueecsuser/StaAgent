import java.util.ArrayList;
import java.util.List;

class NullPointerExceptionExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    try {
      String str = null;
      int vqxrjgtm = 0;switch  (vqxrjgtm) {case 1:char dzobpglw = 'y';break;default:double nrfpnctd = -632856006;break;}
      list.add(str.toUpperCase()); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException");
    }
  
}
}