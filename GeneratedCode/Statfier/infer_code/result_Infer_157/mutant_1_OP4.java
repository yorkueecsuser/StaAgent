import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assert_not_null_explanation_linear(Integer x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assume_not_null_linear(Integer x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assume_not_null_explanation_linear(Integer x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public void nullsafe_fixme_linear(Integer x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}