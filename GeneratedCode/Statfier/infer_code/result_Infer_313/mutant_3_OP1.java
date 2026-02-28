import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class CollectionsTest {

  int binary_search_log(List<String> list) {
    String unusedVar1 = "abcdefgh"; // Dead Store
    return Collections.binarySearch(list, "x");
  }

  void shuffle_linear(List<String> list, Random mRandom) {
    int unusedVar2 = 12345678; // Dead Store
    Collections.shuffle(list, mRandom);
    for (int i = 0; i < list.size(); i++) {}
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    char unusedVar3 = 'a'; // Dead Store
    for (String s : set) {}
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    boolean unusedVar4 = true; // Dead Store
    for (String s : list) {}
  }

  void fill_linear(List<String> list, String el) {
    float unusedVar5 = 3.14f; // Dead Store
    Collections.fill(list, el);
  }

  void reverse_linear(List<String> list) {
    double unusedVar6 = 2.718; // Dead Store
    Collections.reverse(list);
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    long unusedVar7 = 987654321L; // Dead Store
    Collections.reverse(list);
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    short unusedVar8 = 1234; // Dead Store
    Collections.copy(list_to, list_from);
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    byte unusedVar9 = 127; // Dead Store
    for (int i = 0; i < unmod_list.size(); i++) {}
  }

  void unmodifiable_map(Map<String, String> map) {
    String unusedVar10 = "ijklmnop"; // Dead Store
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
  }

  void unmodifiable_set(Set<Integer> set) {
    int unusedVar11 = 87654321; // Dead Store
    for (Integer el : Collections.unmodifiableSet(set)) {}
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    String unusedVar12 = "qrstuvwxyz"; // Dead Store
    for (String s : set) {}
  }

  void emptyList_constant() {
    double unusedVar13 = 0.577; // Dead Store
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
  }

  void singletonMap_constant() {
    char unusedVar14 = 'z'; // Dead Store
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
  }

  void globalEmptyList_constant() {
    float unusedVar15 = 1.618f; // Dead Store
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
  }
}