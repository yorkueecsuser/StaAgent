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

  // Mutant: Renamed 'people' to 'p'
  void sort_comparator_nlogn(List<Person> p) {
    p.sort(new LexicographicComparator());
  }

  void sublist(List<String> filesList) {

    for (String file : filesList.subList(1, filesList.size())) {}
  }

  // Mutant: Renamed 'filesList' to 'f'
  void sublist_constant(List<String> f) {

    for (String file : f.subList(1, 3)) {}
  }

  void asList_linear(String[] array) {
    List<String> list = Arrays.asList(array);
    for (String el : list) {}
  }

  boolean unknown_bool;

  // Mutant: Renamed 'l1' to 'a'
  List<Integer> two_lists(List<Integer> a, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = a;
    } else {
      l = l2;
    }
    return l;
  }

  void iterate_elements_linear(List<Integer> l) {
    Iterator iterator = l.iterator();
    while (iterator.hasNext()) {
      iterator.next();
    }
  }

  // Mutant: Renamed 'l1' to 'x', 'l2' to 'y'
  void call_iterate_elements_linear(List<Integer> x, List<Integer> y) {
    iterate_elements_linear(two_lists(x, y));
  }

  // Mutant: Renamed 'l1' to 'x', 'l2' to 'y'
  void iter_multiple_list1_linear(List<Integer> x, List<Integer> y) {
    List<Integer> l;
    if (unknown_bool) {
      l = x;
    } else {
      l = y;
    }
    List<Integer> m = new ArrayList<Integer>();
    for (Integer i : l) {
      m.add(i);
    }
  }

  // Mutant: Renamed 'l1' to 'x', 'l2' to 'y'
  void iter_multiple_list2_linear(List<Integer> x, List<Integer> y) {
    List<Integer> l;
    if (unknown_bool) {
      l = x;
    } else {
      l = y;
    }
    for (Integer i : l) {}
  }

  // Mutant: Renamed 'l1' to 'x', 'l2' to 'y'
  void iter_multiple_list3_linear(List<Integer> a, List<Integer> x, List<Integer> y) {
    List<Integer> l;
    if (unknown_bool) {
      l = x;
    } else {
      l = y;
    }
    a.addAll(l);
    for (Integer i : a) {}
  }

  void iter_relation_with_var(List<Integer> a) {
    int k = 0;
    for (Integer i : a) {
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

  // Mutant: Renamed 'a' to 'b'
  void iter_my_own_obj(List<Integer> b) {
    MyOwnObj o = new MyOwnObj();
    for (Integer i : b) {
      o.my_put();
    }
    for (int i = 0; i < o.my_size; i++) {}
  }

  // Mutant: Renamed 'dir' to 'd'
  void call_list_files_linear(File d) {
    File[] files = d.listFiles();
    for (File f : files) {}
  }
}