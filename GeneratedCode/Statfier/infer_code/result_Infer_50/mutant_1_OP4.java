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
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
    return -1;
  }

  void sort_comparator_nlogn(List<Person> people) {
    people.sort(new LexicographicComparator());
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void sublist(List<String> filesList) {
    for (String file : filesList.subList(1, filesList.size())) {}
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void sublist_constant(List<String> filesList) {
    for (String file : filesList.subList(1, 3)) {}
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void asList_linear(String[] array) {
    List<String> list = Arrays.asList(array);
    for (String el : list) {}
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  boolean unknown_bool;

  List<Integer> two_lists(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
    return l;
  }

  void iterate_elements_linear(List<Integer> l) {
    Iterator iterator = l.iterator();
    while (iterator.hasNext()) {
      iterator.next();
    }
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void call_iterate_elements_linear(List<Integer> l1, List<Integer> l2) {
    iterate_elements_linear(two_lists(l1, l2));
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
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
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void iter_multiple_list2_linear(List<Integer> l1, List<Integer> l2) {
    List<Integer> l;
    if (unknown_bool) {
      l = l1;
    } else {
      l = l2;
    }
    for (Integer i : l) {}
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
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
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void iter_relation_with_var(List<Integer> a) {
    int k = 0;
    for (Integer i : a) {
      k += 1;
    }
    for (int i = 0; i < k; i++) {}
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
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
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  void call_list_files_linear(File dir) {
    File[] files = dir.listFiles();
    for (File f : files) {}
    // Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never be printed");
    } else {
      System.out.println("This should also never be printed");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}