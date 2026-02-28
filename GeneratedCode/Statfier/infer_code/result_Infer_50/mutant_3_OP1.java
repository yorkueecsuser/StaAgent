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

  void sort_comparator_nlogn(List<Person> people) {
    people.sort(new LexicographicComparator());
    String qwertyui = "unused"; // Dead Store
  }

  void sublist(List<String> filesList) {
    for (String file : filesList.subList(1, filesList.size())) {}
    int asdfghjk = 42; // Dead Store
  }

  void sublist_constant(List<String> filesList) {
    for (String file : filesList.subList(1, 3)) {}
    double zxcvbnml = 3.14; // Dead Store
  }

  void asList_linear(String[] array) {
    List<String> list = Arrays.asList(array);
    for (String el : list) {}
    boolean poiuytrewq = true; // Dead Store
  }

  boolean unknown_bool;

  List<Integer> two_lists(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    char lkjhgfds = 'a'; // Dead Store
    return l;
  }

  void iterate_elements_linear(List<Integer> l) {
    Iterator iterator = l.iterator();
    while (iterator.hasNext()) {
      iterator.next();
    }
    float mnbvcxz = 2.71f; // Dead Store
  }

  void call_iterate_elements_linear(List<Integer> l1, List<Integer> l2) {
    iterate_elements_linear(two_lists(l1, l2));
    long vbnmkiuj = 100L; // Dead Store
  }

  void iter_multiple_list1_linear(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    List<Integer> m = new ArrayList<Integer>();
    for (Integer i : l) {
      m.add(i);
    }
    short hgfderty = 5; // Dead Store
  }

  void iter_multiple_list2_linear(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    for (Integer i : l) {}
    byte cvbnmkji = 10; // Dead Store
  }

  void iter_multiple_list3_linear(List<Integer> a, List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    a.addAll(l);
    for (Integer i : a) {}
    int tyuioplk = 99; // Dead Store
  }

  void iter_relation_with_var(List<Integer> a) {
    int k = 0;
    for (Integer i : a) {
      k += 1;
    }
    for (int i = 0; i < k; i++) {}
    long jhgfdsa = 123456789L; // Dead Store
  }

  class MyOwnObj {
    int my_size = 0;

    void my_put() {
      my_size += 1;
    }
  }

  void iter_my_own_obj(List<Integer> a) {
    MyOwnObj o = new MyOwnObj();
    for (Integer i : a) {
      o.my_put();
    }
    for (int i = 0; i < o.my_size; i++) {}
    float asdfghjkl = 1.618f; // Dead Store
  }

  void call_list_files_linear(File dir) {
    File[] files = dir.listFiles();
    for (File f : files) {}
    double qazwsxedc = 0.577; // Dead Store
  }
}