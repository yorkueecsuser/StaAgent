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
  static int do_while_independent_of_q_constant(int q) {
    int z = 0;
    do {
      if (q == 15) {
        q = q + 1;
      }
      z++;
    } while (z < 25);

    return 0;
  }

  static void nested_do_while_FQ(int q) {
    int z = 10;
    int w = 0;
    do {
      do {
        if (q == 15) {
          q = q + 1;
        }
        w++;
      } while (w < 10);
      z++;
    } while (z < 20);
  }

  static void dumb_linear(long[] b, int length) {
    for (int j = 1; j < length; j++) {
      if (b[j] < b[j - 1]) {
        b[j - 1] = 0;
      } else {
        b[j] = 1;
      }
    }
  }

  static void dumbSort_quadratic(long[] b, long[] c, int length) {
    for (int j = length - 1; j >= 0; --j) {
      for (int k = 0; k < j; ++k) {
        if (b[k] * c[k + 1] > b[k + 1] * c[k]) {
          long temp = b[k + 1];
          b[k + 1] = b[k];
          b[k] = temp;
          temp = c[k + 1];
          c[k + 1] = c[k];
          c[k] = temp;
        }
      }
    }
  }

  public static class D {
    public char d;
    public float[] e;
  }

  static boolean similar_linear(D[] x, D[] y) {
    if (x == null || y == null || x.length!= y.length) {
      return false;
    }
    for (int j = 0; j < x.length; j++) {
      if (x[j].d!= y[j].d || x[j].e.length!= y[j].e.length) {
        return false;
      }
    }
    return true;
  }

  static void loop_linear(int y) {
    for (int j = 0; j < y; j++) {}
  }

  static void unboundedSymbol_FQ() {
    int infinite = 9;
    for (int j = 0; j < 999; j++) {
      infinite *= infinite;
    }
    loop_linear(infinite);
  }

  void string_length_linear(String t) {
    for (int j = 0; j < t.length(); j++) {}
  }

  void string_concat_linear(String t, String q) {
    q = q.concat(t);
    for (int j = 0; j < q.length(); j++) {}
  }

  void zeropad_linear_FN(String t, String q) {
    // control variable for the loop is the result of equals which is
    // in [0,1]. It should be q instead.
    while (t.equals(q)) {
      q = q.concat("0");
    }
  }

  void charsequence_length_linear(CharSequence seq) {
    for (int j = 0; j < seq.length(); j++) {}
  }

  void modeled_range_linear_FP(FileChannel fc, ByteBuffer bb) throws IOException {
    int j;
    int offset = 0;
    do {
      int numBytesRead = fc.read(bb, offset);
      if (numBytesRead == -1) {
        break;
      }
      j = bb.getInt();
      offset += 8;
    } while (j!= 0);
  }

  class MyLinkedListQ {
    MyLinkedListQ next;

    MyLinkedListQ getNext() {
      return next;
    }
  }

  void length_of_linked_list_simple_linear(MyLinkedListQ p) {
    while (p!= null) {
      p = p.getNext();
    }
  }

  void length_of_linked_list_linear_FP(MyLinkedListQ p) {
    int n = 0;
    while (p!= null) {
      n++;
      p = p.getNext();
    }
    loop_linear(n);
  }

  void linked_list_model_linear(Activity q) {
    while (q!= null) {
      q = q.getParent();
    }
  }

  boolean randQ;

  void two_control_variables_linear_FP(int n) {
    int j = 0;
    int k = n;
    while (j <= k) {
      if (randQ) {
        j++;
      } else {
        k--;
      }
    }
  }

  int loop_prune_constant(ArrayList<Integer> list) {
    int k = 0;
    for (int j = 0; j < 3; ++j) {
      if (list.size() >= j + 1) {
        k++;
      }
    }
    return k;
  }
}