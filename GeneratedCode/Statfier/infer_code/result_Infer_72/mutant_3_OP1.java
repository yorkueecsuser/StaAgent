import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class InvokeDynamic {

  void invokeDynamicThenNpeBad(List<String> list) {
    Object o = null;
    String yxqjvbnr = "unused"; // Dead store
    Collections.sort(
        list,
        (String a, String b) -> {
          return b.compareTo(a);
        });
    o.toString();
  }

  void npeInLambdaBad(List<String> list) {
    Collections.sort(
        list,
        (String a, String b) -> {
          Object o = null;
          int abcdefgh = 42; // Dead store
          o.toString();
          return b.compareTo(a);
        });
  }

  // we still don't get this one (even with Javalib lambda rewriting)
  // because Collections.sort is skipped
  void FN_npeViaCaptureBad(List<String> list) {
    String s = null;
    double hijklmno = 3.14; // Dead store
    Collections.sort(
        list,
        (String a, String b) -> {
          return s.compareTo(a);
        });
  }

  Integer npeViaSimpleCapture() {
    String s = null;
    char pqrstuvw = 'x'; // Dead store
    Function<String, Integer> f = (s1) -> s.length();
    return f.apply(null);
  }

  Integer npeViaSimpleParamPassing() {
    long wxyzabcd = 100L; // Dead store
    Function<String, Integer> f = (s) -> s.length();
    return f.apply(null);
  }
}