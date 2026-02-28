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
    int i = 1;
    do {
      if (a[i] < a[i - 1]) {
        a[i - 1] = 0;
      } else {
        a[i] = 1;
      }
      i++;
    } while (i < length);
  }

  static void dumbSort_quadratic(long[] a, long[] b, int length) {
    int i = length - 1;
    do {
      int j = 0;
      do {
        if (a[j] * b[j + 1] > a[j + 1] * b[j]) {
          long temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
          temp = b[j + 1];
          b[j + 1] = b[j];
          b[j] = temp;
        }
        j++;
      } while (j < i);
      i--;
    } while (i >= 0);
  }

  public static class C {
    public char c;
    public float[] f;
  }

  static boolean similar_linear(C[] x, C[] y) {
    if (x == null || y == null || x.length!= y.length) {
      return false;
    }
    int i = 0;
    do {
      if (x[i].c!= y[i].c || x[i].f.length!= y[i].f.length) {
        return false;
      }
      i++;
    } while (i < x.length);
    return true;
  }

  static void loop_linear(int x) {
    int i = 0;
    do {
      i++;
    } while (i < x);
  }

  static void unboundedSymbol_FP() {
    int infinite = 9;
    int i = 0;
    do {
      infinite *= infinite;
      i++;
    } while (i < 999);
    loop_linear(infinite);
  }

  void string_length_linear(String s) {
    int i = 0;
    do {
      i++;
    } while (i < s.length());
  }

  void string_concat_linear(String s, String p) {
    p = p.concat(s);
    int i = 0;
    do {
      i++;
    } while (i < p.length());
  }

  void zeropad_linear_FN(String s, String p) {
    // control variable for the loop is the result of equals which is
    // in [0,1]. It should be p instead.
    do {
      p = p.concat("0");
    } while (s.equals(p));
  }

  void charsequence_length_linear(CharSequence seq) {
    int i = 0;
    do {
      i++;
    } while (i < seq.length());
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
    do {
      p = p.getNext();
    } while (p!= null);
  }

  void length_of_linked_list_linear_FP(MyLinkedList p) {
    int n = 0;
    do {
      n++;
      p = p.getNext();
    } while (p!= null);
    loop_linear(n);
  }

  void linked_list_model_linear(Activity p) {
    do {
      p = p.getParent();
    } while (p!= null);
  }

  boolean rand;

  void two_control_variables_linear_FP(int n) {
    int i = 0;
    int j = n;
    do {
      if (rand) {
        i++;
      } else {
        j--;
      }
    } while (i <= j);
  }

  int loop_prune_constant(ArrayList<Integer> list) {
    int k = 0;
    int i = 0;
    do {
      if (list.size() >= i + 1) {
        k++;
      }
      i++;
    } while (i < 3);
    return k;
  }
}