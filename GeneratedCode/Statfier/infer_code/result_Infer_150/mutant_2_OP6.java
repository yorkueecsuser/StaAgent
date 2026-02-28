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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }

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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  static void dumb_linear(long[] a, int length) {
    for (int i = 1; i < length; i++) {
      if (a[i] < a[i - 1]) {
        a[i - 1] = 0;
      } else {
        a[i] = 1;
      }
    }

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  static void unboundedSymbol_FP() {
    int infinite = 9;
    for (int i = 0; i < 999; i++) {
      infinite *= infinite;
    }
    loop_linear(infinite);

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void string_length_linear(String s) {
    for (int i = 0; i < s.length(); i++) {}

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void string_concat_linear(String s, String p) {
    p = p.concat(s);
    for (int i = 0; i < p.length(); i++) {}

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void zeropad_linear_FN(String s, String p) {
    // control variable for the loop is the result of equals which is
    // in [0,1]. It should be p instead.
    while (s.equals(p)) {
      p = p.concat("0");
    }

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void charsequence_length_linear(CharSequence seq) {
    for (int i = 0; i < seq.length(); i++) {}

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void length_of_linked_list_linear_FP(MyLinkedList p) {
    int n = 0;
    while (p!= null) {
      n++;
      p = p.getNext();
    }
    loop_linear(n);

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  void linked_list_model_linear(Activity p) {
    while (p!= null) {
      p = p.getParent();
    }

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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

    // Unreachable for loop mutant
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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

  // Unreachable for loop mutant
  boolean conditionFor = false;
  for (int i = 0; conditionFor; i++) {
    // This loop is unreachable
  }
}