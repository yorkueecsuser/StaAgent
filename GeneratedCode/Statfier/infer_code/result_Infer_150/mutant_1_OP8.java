import android.app.Activity;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

class Loops {

  static int do_while_independent_of_p_constant(int p) {
    int a = 0;
    do {
      if (p == 15) {
        p = p + 1;
      }
      a++;
    } while (a < 25);

    return 0;
  }

  /* can't handle this type of nested loops properly, but control vars
  of both loops must be {a, b} */
  static void nested_do_while_FP(int p) {
    int a = 10;
    int b = 0;
    do {
      do {
        if (p == 15) {
          p = p + 1;
        }
        b++;
      } while (b < 10);
      a++;
    } while (a < 20);
  }

  static void dumb_linear(long[] a, int length) {
    for (int i = 1; i < length; i++) {
      if (a[i] < a[i - 1]) {
        a[i - 1] = 0;
      } else {
        a[i] = 1;
      }
    }
  }

  static void dumbSort_quadratic(long[] a, long[] b, int length) {
    for (int i = length - 1; i >= 0; --i) {
      for (int j = 0; j < i; ++j) {
        if (a[j] * b[j + 1] > a[j + 1] * b[j]) {
          long temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
          temp = b[j + 1];
          b[j + 1] = b[j];
          b[j] = temp;
        }
      }
    }
  }

  public static class C {
    public char c;
    public float[] f;
  }

  static boolean similar_linear(C[] x, C[] y) {
    if (x == null || y == null || x.length!= y.length) {
      return false;
    }
    for (int i = 0; i < x.length; i++) {
      if (x[i].c!= y[i].c || x[i].f.length!= y[i].f.length) {
        return false;
      }
    }
    return true;
  }

  static void loop_linear(int x) {
    for (int i = 0; i < x; i++) {}
  }

  static void unboundedSymbol_FP() {
    int infinite = 9;
    for (int i = 0; i < 999; i++) {
      infinite *= infinite;
    }
    loop_linear(infinite);
  }

  void string_length_linear(String s) {
    for (int i = 0; i < s.length(); i++) {}
  }

  void string_concat_linear(String s, String p) {
    p = p.concat(s);
    for (int i = 0; i < p.length(); i++) {}
  }

  void zeropad_linear_FN(String s, String p) {
    // control variable for the loop is the result of equals which is
    // in [0,1]. It should be p instead.
    while (s.equals(p)) {
      p = p.concat("0");
    }
  }

  void charsequence_length_linear(CharSequence seq) {
    for (int i = 0; i < seq.length(); i++) {}
  }

  void modeled_range_linear_FP(FileChannel fc, ByteBuffer bb) throws IOException {
    int i;
    int offset = 0;
    do {
      int numBytesRead = fc.read(bb, offset);
      if (numBytesRead == -1) {
        break;
      }
      i = bb.getInt();
      offset += 8;
    } while (i!= 0);
  }

  class MyLinkedList {
    MyLinkedList next;

    MyLinkedList getNext() {
      return next;
    }
  }

  void length_of_linked_list_simple_linear(MyLinkedList p) {
    while (p!= null) {
      p = p.getNext();
    }
  }

  void length_of_linked_list_linear_FP(MyLinkedList p) {
    int n = 0;
    while (p!= null) {
      n++;
      p = p.getNext();
    }
    loop_linear(n);
  }

  void linked_list_model_linear(Activity p) {
    while (p!= null) {
      p = p.getParent();
    }
  }

  boolean rand;

  void two_control_variables_linear_FP(int n) {
    int i = 0;
    int j = n;
    while (i <= j) {
      if (rand) {
        i++;
      } else {
        j--;
      }
    }
  }

  int loop_prune_constant(ArrayList<Integer> list) {
    int k = 0;
    for (int i = 0; i < 3; ++i) {
      if (list.size() >= i + 1) {
        k++;
      }
    }
    return k;
  }

  // Mutated code
  static int do_while_independent_of_p_constant_mutated(int q) {
    int z = 0;
    do {
      if (q == 15) {
        q = q + 1;
      }
      z++;
    } while (z < 25);

    return 0;
  }

  static void nested_do_while_FP_mutated(int r) {
    int m = 10;
    int n = 0;
    do {
      do {
        if (r == 15) {
          r = r + 1;
        }
        n++;
      } while (n < 10);
      m++;
    } while (m < 20);
  }

  static void dumb_linear_mutated(long[] b, int size) {
    for (int j = 1; j < size; j++) {
      if (b[j] < b[j - 1]) {
        b[j - 1] = 0;
      } else {
        b[j] = 1;
      }
    }
  }

  static void dumbSort_quadratic_mutated(long[] c, long[] d, int len) {
    for (int k = len - 1; k >= 0; --k) {
      for (int l = 0; l < k; ++l) {
        if (c[l] * d[l + 1] > c[l + 1] * d[l]) {
          long temp = c[l + 1];
          c[l + 1] = c[l];
          c[l] = temp;
          temp = d[l + 1];
          d[l + 1] = d[l];
          d[l] = temp;
        }
      }
    }
  }

  static boolean similar_linear_mutated(C[] u, C[] v) {
    if (u == null || v == null || u.length!= v.length) {
      return false;
    }
    for (int w = 0; w < u.length; w++) {
      if (u[w].c!= v[w].c || u[w].f.length!= v[w].f.length) {
        return false;
      }
    }
    return true;
  }

  static void loop_linear_mutated(int y) {
    for (int x = 0; x < y; x++) {}
  }

  static void unboundedSymbol_FP_mutated() {
    int infinite_mutated = 9;
    for (int i_mutated = 0; i_mutated < 999; i_mutated++) {
      infinite_mutated *= infinite_mutated;
    }
    loop_linear_mutated(infinite_mutated);
  }

  void string_length_linear_mutated(String t) {
    for (int i_mutated = 0; i_mutated < t.length(); i_mutated++) {}
  }

  void string_concat_linear_mutated(String t, String r) {
    r = r.concat(t);
    for (int i_mutated = 0; i_mutated < r.length(); i_mutated++) {}
  }

  void zeropad_linear_FN_mutated(String t, String r) {
    // control variable for the loop is the result of equals which is
    // in [0,1]. It should be r instead.
    while (t.equals(r)) {
      r = r.concat("0");
    }
  }

  void charsequence_length_linear_mutated(CharSequence seq_mutated) {
    for (int i_mutated = 0; i_mutated < seq_mutated.length(); i_mutated++) {}
  }

  void modeled_range_linear_FP_mutated(FileChannel fc_mutated, ByteBuffer bb_mutated) throws IOException {
    int i_mutated;
    int offset_mutated = 0;
    do {
      int numBytesRead_mutated = fc_mutated.read(bb_mutated, offset_mutated);
      if (numBytesRead_mutated == -1) {
        break;
      }
      i_mutated = bb_mutated.getInt();
      offset_mutated += 8;
    } while (i_mutated!= 0);
  }

  class MyLinkedList_mutated {
    MyLinkedList_mutated next_mutated;

    MyLinkedList_mutated getNext_mutated() {
      return next_mutated;
    }
  }

  void length_of_linked_list_simple_linear_mutated(MyLinkedList_mutated p_mutated) {
    while (p_mutated!= null) {
      p_mutated = p_mutated.getNext_mutated();
    }
  }

  void length_of_linked_list_linear_FP_mutated(MyLinkedList_mutated p_mutated) {
    int n_mutated = 0;
    while (p_mutated!= null) {
      n_mutated++;
      p_mutated = p_mutated.getNext_mutated();
    }
    loop_linear_mutated(n_mutated);
  }

  void linked_list_model_linear_mutated(Activity p_mutated) {
    while (p_mutated!= null) {
      p_mutated = p_mutated.getParent();
    }
  }

  boolean rand_mutated;

  void two_control_variables_linear_FP_mutated(int n_mutated) {
    int i_mutated = 0;
    int j_mutated = n_mutated;
    while (i_mutated <= j_mutated) {
      if (rand_mutated) {
        i_mutated++;
      } else {
        j_mutated--;
      }
    }
  }

  int loop_prune_constant_mutated(ArrayList<Integer> list_mutated) {
    int k_mutated = 0;
    for (int i_mutated = 0; i_mutated < 3; ++i_mutated) {
      if (list_mutated.size() >= i_mutated + 1) {
        k_mutated++;
      }
    }
    return k_mutated;
  }
}