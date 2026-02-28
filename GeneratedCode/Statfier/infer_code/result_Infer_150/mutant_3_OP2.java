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
      a++; // Mutant: duplicated assignment
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
        b++; // Mutant: duplicated assignment
      } while (b < 10);
      a++;
      a++; // Mutant: duplicated assignment
    } while (a < 20);
  }

  static void dumb_linear(long[] a, int length) {
    for (int i = 1; i < length; i++) {
      if (a[i] < a[i - 1]) {
        a[i - 1] = 0;
        a[i - 1] = 0; // Mutant: duplicated assignment
      } else {
        a[i] = 1;
        a[i] = 1; // Mutant: duplicated assignment
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
          a[j] = temp; // Mutant: duplicated assignment
          temp = b[j + 1];
          b[j + 1] = b[j];
          b[j] = temp;
          b[j] = temp; // Mutant: duplicated assignment
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
    for (int i = 0; i < x; i++) {
      i = i; // Mutant: duplicated assignment
    }
  }

  static void unboundedSymbol_FP() {
    int infinite = 9;
    for (int i = 0; i < 999; i++) {
      infinite *= infinite;
      infinite *= infinite; // Mutant: duplicated assignment
    }
    loop_linear(infinite);
  }

  void string_length_linear(String s) {
    for (int i = 0; i < s.length(); i++) {
      i = i; // Mutant: duplicated assignment
    }
  }

  void string_concat_linear(String s, String p) {
    p = p.concat(s);
    for (int i = 0; i < p.length(); i++) {
      i = i; // Mutant: duplicated assignment
    }
  }

  void zeropad_linear_FN(String s, String p) {
    // control variable for the loop is the result of equals which is
    // in [0,1]. It should be p instead.
    while (s.equals(p)) {
      p = p.concat("0");
      p = p.concat("0"); // Mutant: duplicated assignment
    }
  }

  void charsequence_length_linear(CharSequence seq) {
    for (int i = 0; i < seq.length(); i++) {
      i = i; // Mutant: duplicated assignment
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
      i = bb.getInt(); // Mutant: duplicated assignment
      offset += 8;
      offset += 8; // Mutant: duplicated assignment
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
      p = p.getNext(); // Mutant: duplicated assignment
    }
  }

  void length_of_linked_list_linear_FP(MyLinkedList p) {
    int n = 0;
    while (p!= null) {
      n++;
      n++; // Mutant: duplicated assignment
      p = p.getNext();
    }
    loop_linear(n);
  }

  void linked_list_model_linear(Activity p) {
    while (p!= null) {
      p = p.getParent();
      p = p.getParent(); // Mutant: duplicated assignment
    }
  }

  boolean rand;

  void two_control_variables_linear_FP(int n) {
    int i = 0;
    int j = n;
    while (i <= j) {
      if (rand) {
        i++;
        i++; // Mutant: duplicated assignment
      } else {
        j--;
        j--; // Mutant: duplicated assignment
      }
    }
  }

  int loop_prune_constant(ArrayList<Integer> list) {
    int k = 0;
    for (int i = 0; i < 3; ++i) {
      if (list.size() >= i + 1) {
        k++;
        k++; // Mutant: duplicated assignment
      }
    }
    return k;
  }
}