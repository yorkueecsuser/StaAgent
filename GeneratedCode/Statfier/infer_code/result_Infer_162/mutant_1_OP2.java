import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
    a.add(0, 100); // Mutant: Duplicate assignment statement
  }

  ArrayList collection_remove_from_empty_Bad() {
    ArrayList b = new ArrayList<>();
    b.remove(0);
    b.remove(0); // Mutant: Duplicate assignment statement
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
        arr[10] = 1; // Mutant: Duplicate assignment statement
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
        arr[10] = 1; // Mutant: Duplicate assignment statement
      }
    }
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
    a = new ArrayList<>(-1); // Mutant: Duplicate assignment statement
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
    a = new ArrayList<>(0); // Mutant: Duplicate assignment statement
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
    a = new ArrayList<>(10); // Mutant: Duplicate assignment statement
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
      int y = a.get(9); // Mutant: Duplicate assignment statement
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
      int y = a.get(5); // Mutant: Duplicate assignment statement
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
      arr[idx] = 0; // Mutant: Duplicate assignment statement
    }
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
      arr[idx] = 0; // Mutant: Duplicate assignment statement
    }
  }

  enum MyEnum {
    MyEnumA
  };

  void array_length_Bad() {
    int[] arr = new int[5];
    if (MyEnum.values().length == 0) {
      arr[10] = 0;
      arr[10] = 0; // Mutant: Duplicate assignment statement
    } else {
      arr[10] = 0;
      arr[10] = 0; // Mutant: Duplicate assignment statement
    }
  }
}