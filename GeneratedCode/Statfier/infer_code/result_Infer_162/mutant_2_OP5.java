import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
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
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void null_pruning1_Bad() {
    if (a == null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void null_pruning2_Good_FP() {
    if (a!= null) {
      if (a == null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void null_pruning2_Bad() {
    if (a!= null) {
      if (a!= null) {
        int[] arr = {1, 2, 3, 4, 5};
        arr[10] = 1;
      }
    }
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
    }
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
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
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void iterate_collection_Bad(ArrayList<Integer> a) {
    if (a.size() >= 5) {
      int x = a.get(5);
    }
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
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
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
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
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
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
    // Inserting unreachable switch statement
    boolean condition = false;
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic value for switch condition
  private int getValue(boolean condition) {
    return condition? 1 : 0;
  }
}