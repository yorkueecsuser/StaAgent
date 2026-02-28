import codetoanalyze.java.annotation.Assertions;
import java.util.ArrayList;
import java.util.HashMap;

class InferAnnotationTest {

  public void assert_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x); i++) {}
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  public void assert_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assertNotNull(x, "explanation"); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  public void assume_not_null_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x); i++) {}
    boolean conditionIf = getCondition();
    if (conditionIf) { /* unreachable if block */ }
  }

  public void assume_not_null_explanation_linear(Integer x) {
    for (int i = 0; i < Assertions.assumeNotNull(x, "explanation"); i++) {}
    boolean conditionSwitch = getCondition();
    switch(conditionSwitch) { case true: /* unreachable switch case */ break; }
  }

  public void nullsafe_fixme_linear(Integer x) {
    for (int i = 0; i < Assertions.nullsafeFIXME(x, "explanation"); i++) {}
    boolean conditionDoWhile = getCondition();
    do { /* unreachable do-while loop */ } while (conditionDoWhile);
  }

  public void assert_get_list_constant() {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(5);
    for (int i = 0; i < Assertions.assertGet(0, a); i++) {}
    boolean conditionTryCatch = getCondition();
    try { if (conditionTryCatch) { /* unreachable try block */ } } catch (Exception e) {}
  }

  public void assert_get_map_constant() {
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, 5);
    for (int i = 0; i < Assertions.assertGet(0, m); i++) {}
    boolean conditionSynchronized = getCondition();
    synchronized (this) { if (conditionSynchronized) { /* unreachable synchronized block */ } }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime
  }
}