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
    // Mutant: Renamed 'list' to 'a'
    for (int a = 0; a < list.size(); a++) {}
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    for (String s : set) {}
    // Mutant: Renamed'set' to 'b'
    for (String b : set) {}
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    for (String s : list) {}
    // Mutant: Renamed 'el' to 'c'
    for (String c : list) {}
  }

  void fill_linear(List<String> list, String el) {
    Collections.fill(list, el);
    // Mutant: Renamed 'list' to 'd'
    Collections.fill(d, el);
  }

  void reverse_linear(List<String> list) {
    Collections.reverse(list);
    // Mutant: Renamed 'list' to 'e'
    Collections.reverse(e);
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    Collections.reverse(list);
    // Mutant: Renamed 'list' to 'f'
    Collections.reverse(f);
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    Collections.copy(list_to, list_from);
    // Mutant: Renamed 'list_to' to 'g'
    Collections.copy(g, list_from);
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    for (int i = 0; i < unmod_list.size(); i++) {}
    // Mutant: Renamed 'unmod_list' to 'h'
    for (int i = 0; i < h.size(); i++) {}
  }

  void unmodifiable_map(Map<String, String> map) {
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
    // Mutant: Renamed'map' to 'i'
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(i).entrySet()) {}
  }

  void unmodifiable_set(Set<Integer> set) {
    for (Integer el : Collections.unmodifiableSet(set)) {}
    // Mutant: Renamed'set' to 'j'
    for (Integer el : Collections.unmodifiableSet(j)) {}
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    for (String s : set) {}
    // Mutant: Renamed'set' to 'k'
    for (String k : set) {}
  }

  void emptyList_constant() {
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
    // Mutant: Renamed 'i' to 'l'
    for (int l = 0; l < Collections.emptyList().size(); l++) {}
  }

  void singletonMap_constant() {
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
    // Mutant: Renamed 'i' to'm'
    for (int m = 0; m < Collections.singletonMap(1, 1).size(); m++) {}
  }

  void globalEmptyList_constant() {
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
    // Mutant: Renamed 'i' to 'n'
    for (int n = 0; n < java.util.Collections.EMPTY_LIST.size(); n++) {}
  }
}