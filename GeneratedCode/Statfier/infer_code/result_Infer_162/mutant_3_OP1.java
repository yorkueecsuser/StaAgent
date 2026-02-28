import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
    // Dead Store
    int helloworld = 42;
  }

  ArrayList collection_remove_from_empty_Bad() {
    ArrayList b = new ArrayList<>();
    b.remove(0);
    return b;
    // Dead Store
    String abcdefgh = "unused";
  }

  void null_pruning1_Good() {
    if (a == null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Dead Store
    double ijklmnop = 3.14;
  }

  void null_pruning1_Bad() {
    if (a == null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Dead Store
    char qrstuvwx = 'x';
  }

  void null_pruning2_Good_FP() {
    if (a!= null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Dead Store
    boolean yzabcdef = true;
  }

  void null_pruning2_Bad() {
    if (a!= null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Dead Store
    float ghijklmn = 2.71f;
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
    // Dead Store
    long opqrstuv = 987654321L;
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
    // Dead Store
    short vwxyzabc = 123;
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
    // Dead Store
    byte defghijk = 45;
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
    }
    // Dead Store
    int lmnopqrs = 789;
  }

  void call_iterate_collection_Good() {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    this.iterate_collection_Good(x);
    // Dead Store
    int tuvwxyz1 = 101;
  }

  void iterate_collection_Bad(ArrayList<Integer> a) {
    if (a.size() >= 5) {
      int x = a.get(5);
    }
    // Dead Store
    int tuvwxyz2 = 202;
  }

  void call_iterate_collection_Bad() {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    this.iterate_collection_Bad(x);
    // Dead Store
    int tuvwxyz3 = 303;
  }

  boolean b;

  int zero_to_five() {
    return b? 0 : 5;
  }

  void prune_assign_exp_Good() {
    int idx;
    int[] arr = new int[5];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    // Dead Store
    int tuvwxyz4 = 404;
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    // Dead Store
    int tuvwxyz5 = 505;
  }

  enum MyEnum {
    MyEnumA
  };

  void array_length_Bad() {
    int[] arr = new int[5];
    if (MyEnum.values().length == 0) {
      arr[10] = 0;
    } else {
      arr[10] = 0;
    }
    // Dead Store
    int tuvwxyz6 = 606;
  }
}