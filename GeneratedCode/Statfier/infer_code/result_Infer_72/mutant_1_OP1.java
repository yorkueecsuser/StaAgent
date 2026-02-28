import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class InvokeDynamic {

  void invokeDynamicThenNpeBad(List<String> list) {
    Object o = null;
    String xjvqzrht = "unused"; // Dead Store
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
          int wfnrhtyp = 0; // Dead Store
          o.toString();
          return b.compareTo(a);
        });
  }

  // we still don't get this one (even with Javalib lambda rewriting)
  // because Collections.sort is skipped
  void FN_npeViaCaptureBad(List<String> list) {
    String s = null;
    double kqjxvbnm = 3.14; // Dead Store
    Collections.sort(
        list,
        (String a, String b) -> {
          return s.compareTo(a);
        });
  }

  Integer npeViaSimpleCapture() {
    String s = null;
    char ghtyujkl = 'a'; // Dead Store
    Function<String, Integer> f = (s1) -> s.length();
    return f.apply(null);
  }

  Integer npeViaSimpleParamPassing() {
    boolean pqwertyu = true; // Dead Store
    Function<String, Integer> f = (s) -> s.length();
    return f.apply(null);
  }
}