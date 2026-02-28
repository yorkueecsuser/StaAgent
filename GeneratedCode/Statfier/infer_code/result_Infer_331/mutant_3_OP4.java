import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Queue;

class PurityModeled {

  double math_random_impure() {
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      return Math.random();
    }
    return Math.random();
  }

  double math_random_infeasible_pure(int x) {
    if (x > 1 && x < 2) {
      return Math.random(); // this path will never be taken
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      return Math.random();
    }
    return 0;
  }

  void arraycopy_pure(int[] src) {
    int[] dst = {5, 10, 20, 30, 40, 50};
    // copies an array from the specified source array
    System.arraycopy(src, 0, dst, 0, 1);
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      System.arraycopy(src, 0, dst, 0, 1);
    }
  }

  public void array_length_loop_pure(Integer[] array) {
    for (int i = 0; i < array.length; i++) {}
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      for (int i = 0; i < array.length; i++) {}
    }
  }

  void write_impure() {
    byte[] temp = new byte[4];
    System.out.write(temp, 0, 4);
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      System.out.write(temp, 0, 4);
    }
  }

  void call_write_impure() {
    write_impure();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      write_impure();
    }
  }

  int math_random_in_loop_impure(int x) {
    int p = 0;
    for (int i = 0; i < x; i++) {
      p += Math.random();
      call_write_impure();
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      p += Math.random();
    }
    return p;
  }

  void list_size_pure(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {}
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      for (int i = 0; i < list.size(); i++) {}
    }
  }

  void list_add_impure(ArrayList<String> list) {
    list.add("a");
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      list.add("a");
    }
  }

  void list_addall_impure(ArrayList<String> list1, ArrayList<String> list2) {
    list1.addAll(list2);
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      list1.addAll(list2);
    }
  }

  void enum_loop_pure(Enumeration<String> e) {
    for (; e.hasMoreElements(); ) {
      Object o = e.nextElement();
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      for (; e.hasMoreElements(); ) {
        Object o = e.nextElement();
      }
    }
  }

  void remove_impure(Iterator<String> i) {
    while (i.hasNext()) {
      if (i.next().equals("Orange")) {
        i.remove();
        break;
      }
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      while (i.hasNext()) {
        i.next();
      }
    }
  }

  void list_set_impure(ArrayList<String> list) {
    list.set(0, "e");
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      list.set(0, "e");
    }
  }

  void call_set_impure(ArrayList<String> list) {
    list_set_impure(list);
    list_set_impure(list);
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      list_set_impure(list);
    }
  }

  // Pulse can only widen a fixed number of times, hence it thinks
  // that the exit of the loop never reaches and results in empty
  // post.
  void timing_call_in_loop_impure() {
    for (int i = 0; i < 10; i++) {
      System.nanoTime();
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      System.nanoTime();
    }
  }

  // Pulse can only widen a fixed number of times, hence it thinks
  // that the exit of the loop never reaches and results in empty
  // post which is considered to be impure.
  void constant_loop_pure_FP() {
    for (int i = 0; i < 10; i++) {}
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      for (int i = 0; i < 10; i++) {}
    }
  }

  // Since n is symbolic, pruning doesn't result in infeasible path,
  // but we assume that the parameter [n] must be 3 due to constant(4)
  // "widening" in pulse.
  void timing_call_in_loop_symb_impure(int n) {
    for (int i = 0; i < n; i++) {
      System.nanoTime();
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      System.nanoTime();
    }
  }

  // Due to getting the wrong summary for the callee (a=3), Pulse ends
  // up thinking that the parameter [a] must be 3 in the loop. Hence, as
  // a result of pruning, exit node becomes infeasible and we get
  // empty summary which is considered to be impure.
  void call_timing_symb_impure(int a) {
    for (int i = 0; i < a; i++) {
      timing_call_in_loop_symb_impure(a);
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      timing_call_in_loop_symb_impure(a);
    }
  }

  // The relation between the parameter and the argument to the callee
  // is broken. Although, the final pulse summary for this function is
  // still wrong.
  void call_timing_symb_unrelated_impure(int a, int b) {
    for (int i = 0; i < a; i++) {
      timing_call_in_loop_symb_impure(b);
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      timing_call_in_loop_symb_impure(b);
    }
  }

  enum Color {
    RED,
    GREEN,
    BLUE; // values() calls clone
  }

  public void enum_iter_pure() {
    for (Color c : Color.values()) {}
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      for (Color c : Color.values()) {}
    }
  }

  @SuppressWarnings("unchecked")
  void clone_pure(ArrayList<String> list) {
    ArrayList<String> cloned = (ArrayList<String>) list.clone();
    cloned.add(""); // no change the list
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      cloned.add("");
    }
  }

  String replace_impure(String s) {
    return s.replace('a', 'f');
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      return s.replace('a', 'f');
    }
    return s;
  }

  void process_queue_impure(ArrayList<Integer> list, Queue<Integer> queue) {
    for (Integer el : list) {
      queue.add(el);
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      queue.add(1);
    }
  }

  String add_impure(ArrayList<Integer> list) {
    Integer el = list.get(0);
    list.add(4);
    return el.toString();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      list.add(4);
    }
    return el.toString();
  }

  void append_impure(StringBuilder strBuilder) {
    strBuilder.append("JavaGuru");
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      strBuilder.append("JavaGuru");
    }
  }

  void append_pure() {
    StringBuilder strBuilder = new StringBuilder("Core");
    strBuilder.append("JavaGuru");
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      strBuilder.append("JavaGuru");
    }
  }

  Integer next_impure(Iterator<Integer> it) {
    return it.next();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      return it.next();
    }
    return 0;
  }

  String remove_iterator_impure(Iterator<Integer> listIterator) {
    Integer f = listIterator.next();
    listIterator.remove();
    return f.toString();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      listIterator.remove();
    }
    return f.toString();
  }

  String remove_fresh_impure(ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    Integer f = listIterator.next();
    listIterator.remove();
    return f.toString();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      listIterator.remove();
    }
    return f.toString();
  }

  void remove_impure_mult(ArrayList<Integer> list) {
    String s1 = remove_fresh_impure(list);
    String s2 = remove_fresh_impure(list);
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      remove_fresh_impure(list);
    }
  }

  public static void remove_all_impure(ArrayList<Integer> list) {
    for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
      Integer entry = iter.next();
      iter.remove();
      System.out.println(entry.toString());
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
        iter.next();
        iter.remove();
      }
    }
  }

  void nested_remove_impure(ArrayList<ArrayList<Integer>> list) {
    Iterator<ArrayList<Integer>> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      ArrayList<Integer> inner_list = listIterator.next();
      Iterator<Integer> innerListIterator = inner_list.iterator();
      while (innerListIterator.hasNext()) {
        Integer el = innerListIterator.next();
        innerListIterator.remove();
      }
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      while (listIterator.hasNext()) {
        listIterator.next();
      }
    }
  }

  void remove_all_directly_impure(ArrayList<Integer> list) {
    for (Integer el : list) {
      list.remove(el); // bad, must remove via iterator.
    }
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      list.remove(0);
    }
  }

  public static final String toString_delete_pure(Object args) {
    StringBuilder builder = new StringBuilder(32).append('{');
    if (args!= null) {
      if (builder.charAt(builder.length() - 2) == ',') {
        builder.delete(builder.length() - 2, builder.length());
      }
    }
    builder.append('}').setLength(10);
    return builder.toString();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      builder.append('}');
    }
    return builder.toString();
  }

  String getCanonicalPath_pure(File file) throws IOException {
    return file.getCanonicalPath();
    boolean condition = Math.random() < -1; // Always false, but not a compile-time constant
    if (condition) {
      return file.getCanonicalPath();
    }
    return "";
  }
}