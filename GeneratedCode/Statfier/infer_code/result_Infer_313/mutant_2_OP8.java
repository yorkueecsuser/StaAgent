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
    // Mutant
    Random r = mRandom;
    Collections.shuffle(list, r);
    for (int j = 0; j < list.size(); j++) {}
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    for (String s : set) {}
    // Mutant
    Set<String> st = Collections.singleton("ezgi");
    for (String t : st) {}
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    for (String s : list) {}
    // Mutant
    List<String> lst = Collections.singletonList(el);
    for (String ss : lst) {}
  }

  void fill_linear(List<String> list, String el) {
    Collections.fill(list, el);
    // Mutant
    List<String> l = list;
    Collections.fill(l, el);
  }

  void reverse_linear(List<String> list) {
    Collections.reverse(list);
    // Mutant
    List<String> lst = list;
    Collections.reverse(lst);
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    Collections.reverse(list);
    // Mutant
    List<String> lst = Collections.singletonList(el);
    Collections.reverse(lst);
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    Collections.copy(list_to, list_from);
    // Mutant
    List<String> lf = list_from;
    List<String> lt = list_to;
    Collections.copy(lt, lf);
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    for (int i = 0; i < unmod_list.size(); i++) {}
    // Mutant
    List<String> ul = Collections.unmodifiableList(list);
    for (int j = 0; j < ul.size(); j++) {}
  }

  void unmodifiable_map(Map<String, String> map) {
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
    // Mutant
    Map<String, String> mp = map;
    for (Map.Entry<String, String> e : Collections.unmodifiableMap(mp).entrySet()) {}
  }

  void unmodifiable_set(Set<Integer> set) {
    for (Integer el : Collections.unmodifiableSet(set)) {}
    // Mutant
    Set<Integer> st = set;
    for (Integer e : Collections.unmodifiableSet(st)) {}
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    for (String s : set) {}
    // Mutant
    Set<String> st = Collections.emptySet();
    for (String t : st) {}
  }

  void emptyList_constant() {
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
    // Mutant
    for (int j = 0; j < Collections.emptyList().size(); j++) {}
  }

  void singletonMap_constant() {
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
    // Mutant
    for (int j = 0; j < Collections.singletonMap(1, 1).size(); j++) {}
  }

  void globalEmptyList_constant() {
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
    // Mutant
    for (int j = 0; j < java.util.Collections.EMPTY_LIST.size(); j++) {}
  }
}