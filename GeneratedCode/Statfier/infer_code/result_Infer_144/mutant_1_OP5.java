enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {}
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {}
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 3:
        System.out.println("This is unreachable");
        break;
      case 4:
        System.out.println("This is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}