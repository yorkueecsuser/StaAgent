import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    // Mutant: Renamed variable 'x' to 'y'
    for (int y = 0; y < Assertions.assertNotNull(x); y++) {}
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    // Mutant: Renamed variable 'x' to 'z'
    for (int z = 0; z < Assertions.assertNotNull(x, "explanation"); z++) {}
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    // Mutant: Renamed variable 'i' to 'j'
    for (int j = 0; j < Assertions.assumeNotNull(x); j++) {}
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    // Mutant: Renamed variable 'x' to 'w'
    for (int w = 0; w < Assertions.assumeNotNull(x, "explanation"); w++) {}
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    // Mutant: Renamed variable 'i' to 'v'
    for (int v = 0; v < Assertions.nullsafeFIXME(x, "explanation"); v++) {}
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    // Mutant: Renamed variable 'a' to 'b'
    ArrayList<Integer> b = new ArrayList<>();
    b.add(5);
    for (int i = 0; i < Assertions.assertGet(0, b); i++) {}
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    // Mutant: Renamed variable'm' to 'n'
    HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
    n.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, n); i++) {}
  }
}