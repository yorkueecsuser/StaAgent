import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}