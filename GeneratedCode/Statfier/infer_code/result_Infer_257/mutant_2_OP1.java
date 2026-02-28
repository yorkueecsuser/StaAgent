import java.util.ArrayList;

class ArrayListTest {

  void alloc_is_negative_bad() {
    // initial capacity cannot be negative
    ArrayList<Integer> x = new ArrayList<Integer>(-1);
    String qwerasdf = "deadstore"; // Dead Store
  }

  void alloc_is_ok() {
    // initial capacity cannot be negative
    ArrayList<Integer> x = new ArrayList<Integer>(9);
    int yuiophjk = 42; // Dead Store
  }

  void add_in_loop_ok() {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      a.add(0);
    }
    int j = a.get(3);
    double zxcvbnml = 3.14; // Dead Store
  }

  void add_in_loop_bad() {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      a.add(0);
    }
    int j = a.get(6);
    boolean tfghjklz = true; // Dead Store
  }

  void add_in_loop_by_param_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < b.size(); i++) {
      a.add(0);
    }
    int j = a.get(b.size() - 1);
    char asdfghjk = 'a'; // Dead Store
  }

  void add_in_loop_by_param_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < b.size(); i++) {
      a.add(0);
    }
    int j = a.get(b.size() + 1);
    long poiuytrewq = 123456789L; // Dead Store
  }

  boolean unknown_bool;

  void add_in_loop_by_param2_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < b.size(); i++) {
      if (unknown_bool) {
        a.add(0);
      }
    } // a.size should be [0, b.size]
    if (a.size() > 0) {
      int j = b.get(a.size() - 1);
    }
    float lkjhgfds = 2.718f; // Dead Store
  }

  void add_in_loop_by_param2_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (int i = 0; i < b.size(); i++) {
      if (unknown_bool) {
        a.add(0);
      }
    } // a.size should be [0, b.size]
    int j = b.get(a.size());
    byte mnbvcxza = 127; // Dead Store
  }

  void add_in_loop_by_param3_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    if (b.size() > 0) {
      for (int i = 1; i < b.size(); i++) {
        a.add(0);
      }
      int j = a.get(b.size() - 2);
    }
    short qwertyui = 32767; // Dead Store
  }

  void add_in_loop_by_param3_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    if (b.size() > 0) {
      for (int i = 1; i < b.size(); i++) {
        a.add(0);
      }
      int j = a.get(b.size() - 1);
    }
    int cvbnmklp = 987654321; // Dead Store
  }

  void add_in_loop_by_param4_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(0);
    if (b.size() > 0) {
      for (int i = 1; i < b.size(); i++) {
        a.add(0);
      } // a.size = b.size
      int j = a.get(b.size() - 1);
    }
    long asdfghjkl = 9876543210L; // Dead Store
  }

  void add_in_loop_by_param4_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    a.add(0);
    if (b.size() > 0) {
      for (int i = 1; i < b.size(); i++) {
        a.add(0);
      } // a.size = b.size
      int j = a.get(b.size() + 1);
    }
    char zxcvbnm = 'b'; // Dead Store
  }

  void add_in_loop_iterator_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (Integer i : b) {
      a.add(i);
    }
    int j = a.get(b.size() - 1);
    double poiuyt = 1.618; // Dead Store
  }

  void add_in_loop_iterator_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (Integer i : b) {
      a.add(i);
    }
    int j = a.get(b.size() + 1);
    float lkjhgf = 0.577f; // Dead Store
  }

  void remove_in_loop_iterator_good_FP(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (Integer i : b) {
      a.add(i);
    }
    for (Integer i : b) {
      a.remove(i);
    }
    /* a.size should be 0, but it is analyzed to [-oo, b.size] for now.
    - array smashing: It abstracts all members as one abstract value, so cannot precisely analyze
      the set of members in the array.
    - imprecise remove model: Even with the array smashing, it should have been able to analyze
      as [0, b.size], if the semantics of the model was preciser. */
    if (a.size() < 0) {
      int j = b.get(b.size());
    }
    int mnvbcxz = 100; // Dead Store
  }

  void remove_in_loop_iterator_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (Integer i : b) {
      a.add(i);
    }
    for (Integer i : b) {
      a.remove(i);
    } // a.size should be 0
    int j = a.get(0);
    boolean qazwsxed = false; // Dead Store
  }

  void add_in_loop_iterator2_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (Integer i : b) {
      if (unknown_bool) {
        a.add(i);
      }
    } // a.size should be [0, b.size]
    if (a.size() > 0) {
      int j = b.get(a.size() - 1);
    }
    long cvbnm = 1234567890L; // Dead Store
  }

  void add_in_loop_iterator2_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a = new ArrayList<>();
    for (Integer i : b) {
      if (unknown_bool) {
        a.add(i);
      }
    } // a.size should be [0, b.size]
    int j = b.get(a.size());
    int asdfgh = 456; // Dead Store
  }

  void add_and_remove_ok(ArrayList<Integer> a) {
    ArrayList<Integer> b = new ArrayList<Integer>();
    b.add(0);
    for (Integer i : a) {
      b.add(0);
      b.remove(0);
    } // b.size is one here
    int j = b.get(0);
    short qwerty = 32767; // Dead Store
  }

  void add_and_remove_bad(ArrayList<Integer> a) {
    ArrayList<Integer> b = new ArrayList<Integer>();
    for (Integer i : a) {
      b.add(0);
      b.remove(0);
    } // b.size is zero here
    int j = b.get(0);
    char zxcvbn = 'c'; // Dead Store
  }

  void multi_adds_in_loop_iterator_ok(ArrayList<Integer> b) {
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
    for (Integer i : b) {
      a1.add(i);
      a2.add(i);
    }
    int j;
    j = a1.get(b.size() - 1);
    j = a2.get(b.size() - 1);
    int poiuyt = 987654321; // Dead Store
  }

  void multi_adds_in_loop_iterator_bad(ArrayList<Integer> b) {
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
    for (Integer i : b) {
      a1.add(i);
      a2.add(i);
    }
    int j;
    j = a1.get(b.size() + 1);
    j = a2.get(b.size() + 1);
    double lkjhgf = 3.14159; // Dead Store
  }

  void alias_join_bad() {
    int i;
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    if (unknown_bool) {
      a.add(0);
      i = 0; // i = size of b
    } else {
      b.add(0);
      b.add(0);
      i = 0; // i = size of a
    }
    if (i == 0) {
      b.get(0); // size of b should be [0, 2]
    }
    int mnbvcx = 1000; // Dead Store
  }

  interface MyI {
    public ArrayList<Integer> mk_unknown();
  }

  boolean unknown_bool2;
  ArrayList<Integer> unknown_array_list1;
  ArrayList<Integer> unknown_array_list2;

  void loop_on_unknown_iterator_FN(MyI x, int j) {
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b;
    if (unknown_bool) {
      b = a;
    } else {
      b = x.mk_unknown();
    }
    // `b` points to an zero-sized array and `Unknown` pointer.  Thus, the size of array list should
    // be evaluated to [0,+oo] in a sound design.  However, this would harm overall analysis
    // precision with introducing a lot of FPs.  To avoie that, we ignore the size of `Unknown`
    // array list here, instead we get some FNs.
    for (Integer i : b) {
      // Since size of `b` is evaluted to [0,0], here is unreachable.
      if (a.size() <= -1) {
        int[] c = new int[5];
        c[5] = 0;
      } else {
        int[] c = new int[10];
        c[10] = 0;
      }
    }
    boolean tyuiop = true; // Dead Store
  }
}