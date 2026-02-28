import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListTest {

  int indexOfImpl_linear(List<?> list, Object element) {
    ListIterator<?> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
      if (Objects.equal(element, listIterator.next())) {
        return listIterator.previousIndex();
      }
    }
    return -1;
  }

  // Mutant: Renamed 'people' to 'a'
  void sort_comparator_nlogn(List<Person> a) {
    a.sort(new LexicographicComparator());
  }

  void sublist(List<String> filesList) {

    for (String file : filesList.subList(1, filesList.size())) {}
  }

  // Mutant: Renamed 'filesList' to 'b'
  void sublist_constant(List<String> b) {

    for (String file : b.subList(1, 3)) {}
  }

  void asList_linear(String[] array) {
    List<String> list = Arrays.asList(array);
    for (String el : list) {}
  }

  boolean unknown_bool;

  List<Integer> two_lists(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    return l;
  }

  // Mutant: Renamed 'l' to 'c'
  void iterate_elements_linear(List<Integer> c) {
    Iterator iterator = c.iterator();
    while (iterator.hasNext()) {
      iterator.next();
    }
  }

  void call_iterate_elements_linear(List<Integer> l1, List<Integer> l2) {
    iterate_elements_linear(two_lists(l1, l2));
  }

  // Mutant: Renamed 'l' to 'd'
  void iter_multiple_list1_linear(List<Integer> d, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = d;
    } else {
      l = l2;
    }
    List<Integer> m = new ArrayList<Integer>();
    for (Integer i : l) {
      m.add(i);
    }
  }

  // Mutant: Renamed 'l' to 'e'
  void iter_multiple_list2_linear(List<Integer> e, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = e;
    } else {
      l = l2;
    }
    for (Integer i : l) {}
  }

  // Mutant: Renamed 'l' to 'f'
  void iter_multiple_list3_linear(List<Integer> a, List<Integer> f, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = f;
    } else {
      l = l2;
    }
    a.addAll(l);
    for (Integer i : a) {}
  }

  // Mutant: Renamed 'a' to 'g'
  void iter_relation_with_var(List<Integer> g) {
    int k = 0;
    for (Integer i : g) {
      k += 1;
    }
    for (int i = 0; i < k; i++) {}
  }

  class MyOwnObj {
    int my_size = 0;

    void my_put() {
      my_size += 1;
    }
  }

  // Mutant: Renamed 'a' to 'h'
  void iter_my_own_obj(List<Integer> h) {
    MyOwnObj o = new MyOwnObj();
    for (Integer i : h) {
      o.my_put();
    }
    for (int i = 0; i < o.my_size; i++) {}
  }

  // Mutant: Renamed 'dir' to 'i'
  void call_list_files_linear(File i) {
    File[] files = i.listFiles();
    for (File f : files) {}
  }
}