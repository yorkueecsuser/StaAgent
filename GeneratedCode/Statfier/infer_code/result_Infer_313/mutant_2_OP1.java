import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class CollectionsTest {

  int binary_search_log(List<String> list) {
    String qvbnrhty; // Dead store
    return Collections.binarySearch(list, "x");
  }

  void shuffle_linear(List<String> list, Random mRandom) {
    int jkldfghr; // Dead store
    Collections.shuffle(list, mRandom);
    for (int i = 0; i < list.size(); i++) {}
  }

  void singletonSet_constant() {
    Set<String> set = Collections.singleton("ezgi");
    double wertzuiop; // Dead store
    for (String s : set) {}
  }

  void singletonList_constant(String el) {
    List<String> list = Collections.singletonList(el);
    boolean asdfghjk; // Dead store
    for (String s : list) {}
  }

  void fill_linear(List<String> list, String el) {
    char zxcvbnml; // Dead store
    Collections.fill(list, el);
  }

  void reverse_linear(List<String> list) {
    float poiuytrew; // Dead store
    Collections.reverse(list);
  }

  void reverse_constant(String el) {
    List<String> list = Collections.singletonList(el);
    long lkjhgfdsa; // Dead store
    Collections.reverse(list);
  }

  void copy_linear(List<String> list_from, List<String> list_to) {
    short mnbvcxz; // Dead store
    Collections.copy(list_to, list_from);
  }

  void unmodifiable_linear(List<String> list) {
    List<String> unmod_list = Collections.unmodifiableList(list);
    int yuiopasd; // Dead store
    for (int i = 0; i < unmod_list.size(); i++) {}
  }

  void unmodifiable_map(Map<String, String> map) {
    byte hgfdsazxc; // Dead store
    for (Map.Entry<String, String> entry : Collections.unmodifiableMap(map).entrySet()) {}
  }

  void unmodifiable_set(Set<Integer> set) {
    int tredwsaq; // Dead store
    for (Integer el : Collections.unmodifiableSet(set)) {}
  }

  void emptySet_constant() {
    Set<String> set = Collections.emptySet();
    float poiuymnb; // Dead store
    for (String s : set) {}
  }

  void emptyList_constant() {
    long lkjhgfds; // Dead store
    for (int i = 0; i < Collections.emptyList().size(); i++) {}
  }

  void singletonMap_constant() {
    double zxcvbnml; // Dead store
    for (int i = 0; i < Collections.singletonMap(1, 1).size(); i++) {}
  }

  void globalEmptyList_constant() {
    char qwertyui; // Dead store
    for (int i = 0; i < java.util.Collections.EMPTY_LIST.size(); i++) {}
  }
}