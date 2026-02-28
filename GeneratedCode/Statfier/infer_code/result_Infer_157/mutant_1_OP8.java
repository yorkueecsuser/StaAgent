import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    // Mutant
    for (int j = 0; j < Assertions.assertNotNull(x); j++) {}
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    // Mutant
    for (int k = 0; k < Assertions.assertNotNull(x, "explanation"); k++) {}
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    // Mutant
    for (int l = 0; l < Assertions.assumeNotNull(x); l++) {}
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    // Mutant
    for (int m = 0; m < Assertions.assumeNotNull(x, "explanation"); m++) {}
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    // Mutant
    for (int n = 0; n < Assertions.nullsafeFIXME(x, "explanation"); n++) {}
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    // Mutant
    for (int o = 0; o < Assertions.assertGet(0, a); o++) {}
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    // Mutant
    for (int p = 0; p < Assertions.assertGet(0, m); p++) {}
  }
}