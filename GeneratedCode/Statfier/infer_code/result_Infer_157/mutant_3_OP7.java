import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}