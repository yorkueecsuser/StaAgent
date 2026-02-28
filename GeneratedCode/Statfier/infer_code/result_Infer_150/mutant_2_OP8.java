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
  static int do_while_independent_of_p_constant_m(int q) {
    int z = 0;
    do {
      if (q == 15) {
        q = q + 1;
      }
      z++;
    } while (z < 25);

    return 0;
  }

  static void nested_do_while_FP_m(int r) {
    int x = 10;
    int y = 0;
    do {
      do {
        if (r == 15) {
          r = r + 1;
        }
        y++;
      } while (y < 10);
      x++;
    } while (x < 20);
  }

  static void dumb_linear_m(long[] c, int len) {
    for (int v = 1; v < len; v++) {
      if (c[v] < c[v - 1]) {
        c[v - 1] = 0;
      } else {
        c[v] = 1;
      }
    }
  }

  static void dumbSort_quadratic_m(long[] d, long[] e, int len) {
    for (int w = len - 1; w >= 0; --w) {
      for (int u = 0; u < w; ++u) {
        if (d[u] * e[u + 1] > d[u + 1] * e[u]) {
          long tmp = d[u + 1];
          d[u + 1] = d[u];
          d[u] = tmp;
          tmp = e[u + 1];
          e[u + 1] = e[u];
          e[u] = tmp;
        }
      }
    }
  }

  static boolean similar_linear_m(C[] g, C[] h) {
    if (g == null || h == null || g.length!= h.length) {
      return false;
    }
    for (int t = 0; t < g.length; t++) {
      if (g[t].c!= h[t].c || g[t].f.length!= h[t].f.length) {
        return false;
      }
    }
    return true;
  }

  static void loop_linear_m(int y) {
    for (int k = 0; k < y; k++) {}
  }

  static void unboundedSymbol_FP_m() {
    int inf = 9;
    for (int l = 0; l < 999; l++) {
      inf *= inf;
    }
    loop_linear_m(inf);
  }

  void string_length_linear_m(String s) {
    for (int m = 0; m < s.length(); m++) {}
  }

  void string_concat_linear_m(String s, String p) {
    p = p.concat(s);
    for (int n = 0; n < p.length(); n++) {}
  }

  void zeropad_linear_FN_m(String s, String p) {
    while (s.equals(p)) {
      p = p.concat("0");
    }
  }

  void charsequence_length_linear_m(CharSequence seq) {
    for (int o = 0; o < seq.length(); o++) {}
  }

  void modeled_range_linear_FP_m(FileChannel fc, ByteBuffer bb) throws IOException {
    int p;
    int off = 0;
    do {
      int numBytesRead = fc.read(bb, off);
      if (numBytesRead == -1) {
        break;
      }
      p = bb.getInt();
      off += 8;
    } while (p!= 0);
  }

  class MyLinkedList_m {
    MyLinkedList_m nxt;

    MyLinkedList_m getNext_m() {
      return nxt;
    }
  }

  void length_of_linked_list_simple_linear_m(MyLinkedList_m p) {
    while (p!= null) {
      p = p.getNext_m();
    }
  }

  void length_of_linked_list_linear_FP_m(MyLinkedList_m p) {
    int n = 0;
    while (p!= null) {
      n++;
      p = p.getNext_m();
    }
    loop_linear_m(n);
  }

  void linked_list_model_linear_m(Activity p) {
    while (p!= null) {
      p = p.getParent();
    }
  }

  boolean rnd;

  void two_control_variables_linear_FP_m(int n) {
    int i = 0;
    int j = n;
    while (i <= j) {
      if (rnd) {
        i++;
      } else {
        j--;
      }
    }
  }

  int loop_prune_constant_m(ArrayList<Integer> lst) {
    int k = 0;
    for (int idx = 0; idx < 3; ++idx) {
      if (lst.size() >= idx + 1) {
        k++;
      }
    }
    return k;
  }
}