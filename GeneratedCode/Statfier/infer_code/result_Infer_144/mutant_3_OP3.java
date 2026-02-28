enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
    }
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {
      boolean condition = getUnreachableCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}