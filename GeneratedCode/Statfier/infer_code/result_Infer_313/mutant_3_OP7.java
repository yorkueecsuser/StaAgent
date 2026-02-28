import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class CollectionsTest {

  int binary_search_log(List<String> list) {
    return Collections.binarySearch(list, "x");
  }

  void shuffle_linear(List<String> list, Random mRandom) {
    Collections.shuffle(list, mRandom);
    for (int i = 0; i < list.size(); i++) {}
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    for (String s : set) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    for (String s : list) {}
    boolean shouldRun = getCondition();
    if (shouldRun) { /* unreachable if block */ }
  }

  void fill_linear(List<String> list, String el) {
    Collections.fill(list, el);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void reverse_linear(List<String> list) {
    Collections.reverse(list);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    Collections.reverse(list);
    boolean shouldRun = getCondition();
    if (shouldRun) { /* unreachable if block */ }
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    Collections.copy(list_to, list_from);
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    for (int i = 0; i < unmod_list.size(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void unmodifiable_map(Map<String, String> map) {
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
    boolean shouldRun = getCondition();
    if (shouldRun) { /* unreachable if block */ }
  }

  void unmodifiable_set(Set<Integer> set) {
    for (Integer el : Collections.unmodifiableSet(set)) {}
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    for (String s : set) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void emptyList_constant() {
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) { /* unreachable if block */ }
  }

  void singletonMap_constant() {
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void globalEmptyList_constant() {
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loops are unreachable
  }
}