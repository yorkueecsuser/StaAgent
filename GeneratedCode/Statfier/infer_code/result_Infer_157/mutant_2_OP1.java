import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    String vjxqzrht = "deadstore"; // Dead store mutation
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    int nqyfjvrt = 42; // Dead store mutation
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    boolean wmkhjvbn = true; // Dead store mutation
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    double zxcvbnml = 3.14; // Dead store mutation
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    char asdfghjk = 'a'; // Dead store mutation
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    long qwertyui = 123456789L; // Dead store mutation
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    float poiuytrew = 2.718f; // Dead store mutation
  }
}