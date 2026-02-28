import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
  }

  ArrayList collection_remove_from_empty_Bad() {
    ArrayList b = new ArrayList<>();
    b.remove(0);
    return b;
  }

  void null_pruning1_Good() {
    if (a == null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
  }

  void null_pruning1_Bad() {
    if (a == null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
  }

  void null_pruning2_Good_FP() {
    if (a!= null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
  }

  void null_pruning2_Bad() {
    if (a!= null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
    }
  }

  void call_iterate_collection_Good() {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    this.iterate_collection_Good(x);
  }

  void iterate_collection_Bad(ArrayList<Integer> a) {
    if (a.size() >= 5) {
      int x = a.get(5);
    }
  }

  void call_iterate_collection_Bad() {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    x.add(0);
    this.iterate_collection_Bad(x);
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
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
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
  }

  // Mutated code
  void collection_add_zero_Mutant() {
    ArrayList c = new ArrayList<>();
    c.add(0, 100);
  }

  ArrayList collection_remove_from_empty_Mutant() {
    ArrayList d = new ArrayList<>();
    d.remove(0);
    return d;
  }

  void null_pruning1_Mutant() {
    if (a == null) {
      if (a!= null) {
        int[] e = {1, 2, 3, 4, 5};
        e[10] = 1;
      }
    }
  }

  void null_pruning1_Bad_Mutant() {
    if (a == null) {
      if (a == null) {
        int[] f = {1, 2, 3, 4, 5};
        f[10] = 1;
      }
    }
  }

  void null_pruning2_Good_FPMutant() {
    if (a!= null) {
      if (a == null) {
        int[] g = {1, 2, 3, 4, 5};
        g[10] = 1;
      }
    }
  }

  void null_pruning2_Bad_Mutant() {
    if (a!= null) {
      if (a!= null) {
        int[] h = {1, 2, 3, 4, 5};
        h[10] = 1;
      }
    }
  }

  void negative_alloc_Bad_Mutant() {
    ArrayList i = new ArrayList<>(-1);
  }

  void zero_alloc_Good_Mutant() {
    ArrayList j = new ArrayList<>(0);
  }

  void positive_alloc_Good_Mutant() {
    ArrayList k = new ArrayList<>(10);
  }

  void iterate_collection_Good_Mutant(ArrayList<Integer> l) {
    if (l.size() > 10) {
      int m = l.get(9);
    }
  }

  void call_iterate_collection_Good_Mutant() {
    ArrayList<Integer> n = new ArrayList<Integer>();
    n.add(0);
    n.add(0);
    n.add(0);
    n.add(0);
    n.add(0);
    this.iterate_collection_Good(n);
  }

  void iterate_collection_Bad_Mutant(ArrayList<Integer> o) {
    if (o.size() >= 5) {
      int p = o.get(5);
    }
  }

  void call_iterate_collection_Bad_Mutant() {
    ArrayList<Integer> q = new ArrayList<Integer>();
    q.add(0);
    q.add(0);
    q.add(0);
    q.add(0);
    q.add(0);
    this.iterate_collection_Bad(q);
  }

  boolean r;

  int zero_to_five_Mutant() {
    return r? 0 : 5;
  }

  void prune_assign_exp_Good_Mutant() {
    int s;
    int[] t = new int[5];
    if ((s = zero_to_five())!= 5) {
      t[s] = 0;
    }
  }

  void prune_assign_exp_Bad_Mutant() {
    int u;
    int[] v = new int[3];
    if ((u = zero_to_five())!= 5) {
      v[u] = 0;
    }
  }

  enum MyEnumMutant {
    MyEnumAMutant
  };

  void array_length_Bad_Mutant() {
    int[] w = new int[5];
    if (MyEnumMutant.values().length == 0) {
      w[10] = 0;
    } else {
      w[10] = 0;
    }
  }
}