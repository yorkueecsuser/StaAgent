import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(1, 200);
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 300);
    }
  }

  void null_pruning1_Bad() {
    if (a == null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 400);
    }
  }

  void null_pruning2_Good_FP() {
    if (a!= null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 500);
    }
  }

  void null_pruning2_Bad() {
    if (a!= null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 600);
    }
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 700);
    }
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 800);
    }
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 900);
    }
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 1000);
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      x.add(0, 1100);
    }
  }

  void iterate_collection_Bad(ArrayList<Integer> a) {
    if (a.size() >= 5) {
      int x = a.get(5);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      a.add(0, 1200);
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      x.add(0, 1300);
    }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      arr[idx] = 1;
    }
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      arr[idx] = 2;
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      arr[10] = 3;
    }
  }

  private boolean getCondition() {
    return false;
  }
}