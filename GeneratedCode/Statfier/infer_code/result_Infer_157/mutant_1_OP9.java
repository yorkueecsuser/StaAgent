import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    int i = 0;
    do {
    } while (i++ < Assertions.assertNotNull(x));
  }

  public void assert_not_null_explanation_linear(Integer x) {
    int i = 0;
    do {
    } while (i++ < Assertions.assertNotNull(x, "explanation"));
  }

  public void assume_not_null_linear(Integer x) {
    int i = 0;
    do {
    } while (i++ < Assertions.assumeNotNull(x));
  }

  public void assume_not_null_explanation_linear(Integer x) {
    int i = 0;
    do {
    } while (i++ < Assertions.assumeNotNull(x, "explanation"));
  }

  public void nullsafe_fixme_linear(Integer x) {
    int i = 0;
    do {
    } while (i++ < Assertions.nullsafeFIXME(x, "explanation"));
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    int i = 0;
    do {
    } while (i++ < Assertions.assertGet(0, a));
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    int i = 0;
    do {
    } while (i++ < Assertions.assertGet(0, m));
  }
}