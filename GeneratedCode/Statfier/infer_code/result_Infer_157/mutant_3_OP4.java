import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that will never execute either
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}