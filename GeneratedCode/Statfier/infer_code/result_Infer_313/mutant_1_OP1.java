import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class CollectionsTest {

  int binary_search_log(List<String> list) {
    return Collections.binarySearch(list, "x");
    // Dead Store Mutation
    String jxqfzvbn = "unused";
  }

  void shuffle_linear(List<String> list, Random mRandom) {
    Collections.shuffle(list, mRandom);
    for (int i = 0; i < list.size(); i++) {}
    // Dead Store Mutation
    int klnmopqr = 42;
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    for (String s : set) {}
    // Dead Store Mutation
    boolean rstuvwxy = true;
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    for (String s : list) {}
    // Dead Store Mutation
    double yzabcd = 3.14;
  }

  void fill_linear(List<String> list, String el) {
    Collections.fill(list, el);
    // Dead Store Mutation
    char efghijkl = 'a';
  }

  void reverse_linear(List<String> list) {
    Collections.reverse(list);
    // Dead Store Mutation
    float mnopqrst = 2.718f;
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    Collections.reverse(list);
    // Dead Store Mutation
    long tuvwxyz = 987654321L;
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    Collections.copy(list_to, list_from);
    // Dead Store Mutation
    short abcdefg = 123;
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    for (int i = 0; i < unmod_list.size(); i++) {}
    // Dead Store Mutation
    byte hijklmn = 10;
  }

  void unmodifiable_map(Map<String, String> map) {
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
    // Dead Store Mutation
    String opqrstu = "anotherUnused";
  }

  void unmodifiable_set(Set<Integer> set) {
    for (Integer el : Collections.unmodifiableSet(set)) {}
    // Dead Store Mutation
    int vwxyzabc = 7;
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    for (String s : set) {}
    // Dead Store Mutation
    boolean defghijk = false;
  }

  void emptyList_constant() {
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
    // Dead Store Mutation
    double lmnopqrs = 1.618;
  }

  void singletonMap_constant() {
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
    // Dead Store Mutation
    char tuvwxyza = 'b';
  }

  void globalEmptyList_constant() {
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
    // Dead Store Mutation
    int bcdefghi = 456;
  }
}