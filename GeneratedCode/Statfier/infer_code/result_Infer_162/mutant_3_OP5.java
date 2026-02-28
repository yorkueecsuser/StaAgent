import java.util.ArrayList;

class Array {
  private ArrayList a = new ArrayList<>();

  void collection_add_zero_Good() {
    a.add(0, 100);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  void negative_alloc_Bad() {
    a = new ArrayList<>(-1);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  void zero_alloc_Good() {
    a = new ArrayList<>(0);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  void positive_alloc_Good() {
    a = new ArrayList<>(10);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  void iterate_collection_Good(ArrayList<Integer> a) {
    if (a.size() > 10) {
      int x = a.get(9);
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  void iterate_collection_Bad(ArrayList<Integer> a) {
    if (a.size() >= 5) {
      int x = a.get(5);
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  void prune_assign_exp_Bad() {
    int idx;
    int[] arr = new int[3];
    if ((idx = zero_to_five())!= 5) {
      arr[idx] = 0;
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}