import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class InvokeDynamic {

  void invokeDynamicThenNpeBad(List<String> list) {
    Object o = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
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
          boolean condition = getCondition();
          if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement");
          }
          o.toString();
          return b.compareTo(a);
        });
  }

  // we still don't get this one (even with Javalib lambda rewriting)
  // because Collections.sort is skipped
  void FN_npeViaCaptureBad(List<String> list) {
    String s = null;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    Collections.sort(
        list,
        (String a, String b) -> {
          return s.compareTo(a);
        });
  }

  Integer npeViaSimpleCapture() {
    String s = null;
    Function<String, Integer> f = (s1) -> {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
      return s.length();
    };
    return f.apply(null);
  }

  Integer npeViaSimpleParamPassing() {
    Function<String, Integer> f = (s) -> {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement");
      }
      return s.length();
    };
    return f.apply(null);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}