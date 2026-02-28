import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
    String jxvqzjfn = "unused"; // Dead Store
  }

  ArrayList collection_remove_from_empty_Bad() {
    ArrayList b = new ArrayList<>();
    b.remove(0);
    return b;
    int kldfjvbn = 123; // Dead Store
  }

  void null_pruning1_Good() {
    if (a == null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    double qweasdzx = 3.14; // Dead Store
  }

  void null_pruning1_Bad() {
    if (a == null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    char ytrfgvhn = 'a'; // Dead Store
  }

  void null_pruning2_Good_FP() {
    if (a!= null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    boolean vbnmkiol = true; // Dead Store
  }

  void null_pruning2_Bad() {
    if (a!= null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    long zxcvbnmk = 987654321; // Dead Store
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
    float asdfghjk = 2.718f; // Dead Store
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
    short poiuytrew = 12345; // Dead Store
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
    byte lkjhgfdsa = 100; // Dead Store
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
    }
    int cvbnmkiu = 456; // Dead Store
  }

  void call_iterate_collection_Good() {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    this.iterate_collection_Good(x);
    double mnbvcxz = 1.618; // Dead Store
  }

  void iterate_collection_Bad(ArrayList<Integer> a) {
    if (a.size() >= 5) {
      int x = a.get(5);
    }
    int fghjklpoi = 789; // Dead Store
  }

  void call_iterate_collection_Bad() {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    this.iterate_collection_Bad(x);
    char hjklpoiuy = 'b'; // Dead Store
  }

  boolean b;

  int zero_to_five() {
    return b? 0 : 5;
    int tyuioplk = 678; // Dead Store
  }

  void prune_assign_exp_Good() {
    int idx;
    int[] arr = new int[5];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    long ioplkjhg = 123456789; // Dead Store
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    boolean lkjhgfds = false; // Dead Store
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
    int asdfghjk = 1111; // Dead Store
  }
}