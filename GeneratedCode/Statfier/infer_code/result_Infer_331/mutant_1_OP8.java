import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Queue;

class PurityModeled {

  double math_random_impure() {
    return Math.random();
  }

  double math_random_infeasible_pure(int x) {
    if (x > 1 && x < 2) {
      return Math.random(); // this path will never be taken
    }
    return 0;
  }

  void arraycopy_pure(int[] src) {
    int[] dst = {5, 10, 20, 30, 40, 50};
    // copies an array from the specified source array
    System.arraycopy(src, 0, dst, 0, 1);
    int[] dzt = {5, 10, 20, 30, 40, 50}; // mutant
    System.arraycopy(src, 0, dzt, 0, 1); // mutant
  }

  public void array_length_loop_pure(Integer[] array) {
    for (int i = 0; i < array.length; i++) {}
    for (int j = 0; j < array.length; j++) {} // mutant
  }

  void write_impure() {
    byte[] temp = new byte[4];
    System.out.write(temp, 0, 4);
  }

  void call_write_impure() {
    write_impure();
  }

  int math_random_in_loop_impure(int x) {
    int p = 0;
    for (int i = 0; i < x; i++) {
      p += Math.random();
      call_write_impure();
    }

    return p;
    int q = 0; // mutant
    for (int k = 0; k < x; k++) { // mutant
      q += Math.random(); // mutant
      call_write_impure(); // mutant
    }
    return q; // mutant
  }

  void list_size_pure(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {}
    for (int j = 0; j < list.size(); j++) {} // mutant
  }

  void list_add_impure(ArrayList<String> list) {
    list.add("a");
    list.add("b"); // mutant
  }

  void list_addall_impure(ArrayList<String> list1, ArrayList<String> list2) {
    list1.addAll(list2);
    list1.addAll(list2); // mutant
  }

  void enum_loop_pure(Enumeration<String> e) {

    for (; e.hasMoreElements(); ) {
      Object o = e.nextElement();
    }
    for (; e.hasMoreElements(); ) { // mutant
      Object n = e.nextElement(); // mutant
    }
  }

  void remove_impure(Iterator<String> i) {
    while (i.hasNext()) {
      if (i.next().equals("Orange")) {
        i.remove();
        break;
      }
    }
    while (i.hasNext()) { // mutant
      if (i.next().equals("Green")) { // mutant
        i.remove(); // mutant
        break; // mutant
      }
    }
  }

  void list_set_impure(ArrayList<String> list) {
    list.set(0, "e");
    list.set(1, "f"); // mutant
  }

  void call_set_impure(ArrayList<String> list) {
    list_set_impure(list);
    list_set_impure(list);
    list_set_impure(list); // mutant
  }

  // Pulse can only widen a fixed number of times, hence it thinks
  // that the exit of the loop never reaches and results in empty
  // post.
  void timing_call_in_loop_impure() {
    for (int i = 0; i < 10; i++) {
      System.nanoTime();
    }
    for (int j = 0; j < 10; j++) { // mutant
      System.nanoTime(); // mutant
    }
  }

  // Pulse can only widen a fixed number of times, hence it thinks
  // that the exit of the loop never reaches and results in empty
  // post which is considered to be impure.
  void constant_loop_pure_FP() {
    for (int i = 0; i < 10; i++) {}
    for (int j = 0; j < 10; j++) {} // mutant
  }

  // Since n is symbolic, pruning doesn't result in infeasible path,
  // but we assume that the parameter [n] must be 3 due to constant(4)
  // "widening" in pulse.
  void timing_call_in_loop_symb_impure(int n) {
    for (int i = 0; i < n; i++) {
      System.nanoTime();
    }
    for (int m = 0; m < n; m++) { // mutant
      System.nanoTime(); // mutant
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
    for (int b = 0; b < a; b++) { // mutant
      timing_call_in_loop_symb_impure(a); // mutant
    }
  }

  // The relation between the parameter and the argument to the callee
  // is broken. Although, the final pulse summary for this function is
  // still wrong.
  void call_timing_symb_unrelated_impure(int a, int b) {
    for (int i = 0; i < a; i++) {
      timing_call_in_loop_symb_impure(b);
    }
    for (int c = 0; c < a; c++) { // mutant
      timing_call_in_loop_symb_impure(b); // mutant
    }
  }

  enum Color {
    RED,
    GREEN,
    BLUE; // values() calls clone
  }

  public void enum_iter_pure() {
    for (Color c : Color.values()) {}
    for (Color d : Color.values()) {} // mutant
  }

  @SuppressWarnings("unchecked")
  void clone_pure(ArrayList<String> list) {
    ArrayList<String> cloned = (ArrayList<String>) list.clone();
    cloned.add(""); // no change the list
    ArrayList<String> cloned2 = (ArrayList<String>) list.clone(); // mutant
    cloned2.add(""); // mutant
  }

  String replace_impure(String s) {
    return s.replace('a', 'f');
    return s.replace('b', 'g'); // mutant
  }

  void process_queue_impure(ArrayList<Integer> list, Queue<Integer> queue) {
    for (Integer el : list) {
      queue.add(el);
    }
    for (Integer fl : list) { // mutant
      queue.add(fl); // mutant
    }
  }

  String add_impure(ArrayList<Integer> list) {
    Integer el = list.get(0);
    list.add(4);
    return el.toString();
    Integer fl = list.get(0); // mutant
    list.add(5); // mutant
    return fl.toString(); // mutant
  }

  void append_impure(StringBuilder strBuilder) {
    strBuilder.append("JavaGuru");
    strBuilder.append("JavaDev"); // mutant
  }

  void append_pure() {
    StringBuilder strBuilder = new StringBuilder("Core");
    strBuilder.append("JavaGuru");
    StringBuilder strBld = new StringBuilder("Core"); // mutant
    strBld.append("JavaDev"); // mutant
  }

  Integer next_impure(Iterator<Integer> it) {
    return it.next();
    return it.next(); // mutant
  }

  String remove_iterator_impure(Iterator<Integer> listIterator) {
    Integer f = listIterator.next();
    listIterator.remove();
    return f.toString();
    Integer g = listIterator.next(); // mutant
    listIterator.remove(); // mutant
    return g.toString(); // mutant
  }

  String remove_fresh_impure(ArrayList<Integer> list) {
    Iterator<Integer> listIterator = list.iterator();
    Integer f = listIterator.next();
    listIterator.remove();
    return f.toString();
    Iterator<Integer> lstItr = list.iterator(); // mutant
    Integer h = lstItr.next(); // mutant
    lstItr.remove(); // mutant
    return h.toString(); // mutant
  }

  void remove_impure_mult(ArrayList<Integer> list) {
    String s1 = remove_fresh_impure(list);
    String s2 = remove_fresh_impure(list);
    String t1 = remove_fresh_impure(list); // mutant
    String t2 = remove_fresh_impure(list); // mutant
  }

  public static void remove_all_impure(ArrayList<Integer> list) {
    for (Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
      Integer entry = iter.next();
      iter.remove();
      System.out.println(entry.toString());
    }
    for (Iterator<Integer> itr = list.iterator(); itr.hasNext(); ) { // mutant
      Integer ent = itr.next(); // mutant
      itr.remove(); // mutant
      System.out.println(ent.toString()); // mutant
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
    Iterator<ArrayList<Integer>> lstItr = list.iterator(); // mutant
    while (lstItr.hasNext()) { // mutant
      ArrayList<Integer> innerLst = lstItr.next(); // mutant
      Iterator<Integer> innerLstItr = innerLst.iterator(); // mutant
      while (innerLstItr.hasNext()) { // mutant
        Integer fl = innerLstItr.next(); // mutant
        innerLstItr.remove(); // mutant
      }
    }
  }

  void remove_all_directly_impure(ArrayList<Integer> list) {
    for (Integer el : list) {
      list.remove(el); // bad, must remove via iterator.
    }
    for (Integer fl : list) { // mutant
      list.remove(fl); // mutant
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
    StringBuilder bld = new StringBuilder(32).append('{'); // mutant
    if (args!= null) { // mutant
      if (bld.charAt(bld.length() - 2) == ',') { // mutant
        bld.delete(bld.length() - 2, bld.length()); // mutant
      }
    }
    bld.append('}').setLength(10); // mutant
    return bld.toString(); // mutant
  }

  String getCanonicalPath_pure(File file) throws IOException {
    return file.getCanonicalPath();
    return file.getCanonicalPath(); // mutant
  }
}