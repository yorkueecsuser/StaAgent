import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    // Mutant: Rename variable 'x' to 'a'
    for (int b = 0; b < Assertions.assertNotNull(a); b++) {}
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    // Mutant: Rename variable 'x' to 'c'
    for (int d = 0; d < Assertions.assertNotNull(c, "explanation"); d++) {}
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    // Mutant: Rename variable 'x' to 'e'
    for (int f = 0; f < Assertions.assumeNotNull(e); f++) {}
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    // Mutant: Rename variable 'x' to 'g'
    for (int h = 0; h < Assertions.assumeNotNull(g, "explanation"); h++) {}
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    // Mutant: Rename variable 'x' to 'j'
    for (int k = 0; k < Assertions.nullsafeFIXME(j, "explanation"); k++) {}
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    // Mutant: Rename variable 'a' to 'b'
    ArrayList<Integer> c = new ArrayList<>();
    c.add(5);
    for (int d = 0; d < Assertions.assertGet(0, c); d++) {}
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    // Mutant: Rename variable'm' to 'n'
    HashMap<Integer, Integer> o = new HashMap<Integer, Integer>();
    o.put(0, 5);
    for (int p = 0; p < Assertions.assertGet(0, o); p++) {}
  }
}