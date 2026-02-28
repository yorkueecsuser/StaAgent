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
    do {
      if (listIterator.hasNext() && Objects.equal(element, listIterator.next())) {
        return listIterator.previousIndex();
      }
    } while (listIterator.hasNext());
    return -1;
  }

  void sort_comparator_nlogn(List<Person> people) {
    people.sort(new LexicographicComparator());
  }

  void sublist(List<String> filesList) {

    ListIterator<String> iterator = filesList.subList(1, filesList.size()).listIterator();
    do {
      if (iterator.hasNext()) {
        String file = iterator.next();
      }
    } while (iterator.hasNext());
  }

  void sublist_constant(List<String> filesList) {

    ListIterator<String> iterator = filesList.subList(1, 3).listIterator();
    do {
      if (iterator.hasNext()) {
        String file = iterator.next();
      }
    } while (iterator.hasNext());
  }

  void asList_linear(String[] array) {
    List<String> list = Arrays.asList(array);
    Iterator<String> iterator = list.iterator();
    do {
      if (iterator.hasNext()) {
        String el = iterator.next();
      }
    } while (iterator.hasNext());
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

  void iterate_elements_linear(List<Integer> l) {
    Iterator iterator = l.iterator();
    do {
      if (iterator.hasNext()) {
        iterator.next();
      }
    } while (iterator.hasNext());
  }

  void call_iterate_elements_linear(List<Integer> l1, List<Integer> l2) {
    iterate_elements_linear(two_lists(l1, l2));
  }

  void iter_multiple_list1_linear(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    List<Integer> m = new ArrayList<Integer>();
    Iterator<Integer> iterator = l.iterator();
    do {
      if (iterator.hasNext()) {
        Integer i = iterator.next();
        m.add(i);
      }
    } while (iterator.hasNext());
  }

  void iter_multiple_list2_linear(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    Iterator<Integer> iterator = l.iterator();
    do {
      if (iterator.hasNext()) {
        iterator.next();
      }
    } while (iterator.hasNext());
  }

  void iter_multiple_list3_linear(List<Integer> a, List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    a.addAll(l);
    Iterator<Integer> iterator = a.iterator();
    do {
      if (iterator.hasNext()) {
        iterator.next();
      }
    } while (iterator.hasNext());
  }

  void iter_relation_with_var(List<Integer> a) {
    int k = 0;
    Iterator<Integer> iterator = a.iterator();
    do {
      if (iterator.hasNext()) {
        Integer i = iterator.next();
        k += 1;
      }
    } while (iterator.hasNext());
    for (int i = 0; i < k; i++) {}
  }

  class MyOwnObj {
    int my_size = 0;

    void my_put() {
      my_size += 1;
    }
  }

  void iter_my_own_obj(List<Integer> a) {
    MyOwnObj o = new MyOwnObj();
    Iterator<Integer> iterator = a.iterator();
    do {
      if (iterator.hasNext()) {
        Integer i = iterator.next();
        o.my_put();
      }
    } while (iterator.hasNext());
    for (int i = 0; i < o.my_size; i++) {}
  }

  void call_list_files_linear(File dir) {
    File[] files = dir.listFiles();
    int index = 0;
    do {
      if (index < files.length) {
        File f = files[index];
        index++;
      }
    } while (index < files.length);
  }
}