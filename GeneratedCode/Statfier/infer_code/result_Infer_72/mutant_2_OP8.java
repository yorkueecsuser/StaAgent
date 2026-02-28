import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class InvokeDynamic {

  void invokeDynamicThenNpeBad(List<String> list) {
    Object o = null;
    Collections.sort(
        list,
        (String a, String b) -> {
          return b.compareTo(a);
        });
    o.toString();

    // Mutant
    Object x = null;
    Collections.sort(
        list,
        (String c, String d) -> {
          return d.compareTo(c);
        });
    x.toString();
  }

  void npeInLambdaBad(List<String> list) {
    Collections.sort(
        list,
        (String a, String b) -> {
          Object o = null;
          o.toString();
          return b.compareTo(a);
        });

    // Mutant
    Collections.sort(
        list,
        (String e, String f) -> {
          Object y = null;
          y.toString();
          return f.compareTo(e);
        });
  }

  // we still don't get this one (even with Javalib lambda rewriting)
  // because Collections.sort is skipped
  void FN_npeViaCaptureBad(List<String> list) {
    String s = null;
    Collections.sort(
        list,
        (String a, String b) -> {
          return s.compareTo(a);
        });

    // Mutant
    String t = null;
    Collections.sort(
        list,
        (String g, String h) -> {
          return t.compareTo(g);
        });
  }

  Integer npeViaSimpleCapture() {
    String s = null;
    Function<String, Integer> f = (s1) -> s.length();
    return f.apply(null);

    // Mutant
    String u = null;
    Function<String, Integer> g = (u1) -> u.length();
    return g.apply(null);
  }

  Integer npeViaSimpleParamPassing() {
    Function<String, Integer> f = (s) -> s.length();
    return f.apply(null);

    // Mutant
    Function<String, Integer> h = (v) -> v.length();
    return h.apply(null);
  }
}