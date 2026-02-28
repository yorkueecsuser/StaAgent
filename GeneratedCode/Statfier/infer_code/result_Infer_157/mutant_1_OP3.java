import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
  }

  public void assert_not_null_explanation_linear(Integer x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
  }

  public void assume_not_null_linear(Integer x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
  }

  public void assume_not_null_explanation_linear(Integer x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
  }

  public void nullsafe_fixme_linear(Integer x) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is unreachable");
    }
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
  }

  private boolean getCondition() {
    return false;
  }
}