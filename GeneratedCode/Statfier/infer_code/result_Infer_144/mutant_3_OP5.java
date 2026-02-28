enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {}

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to avoid compiler warnings
        break;
    }
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {}

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is another unreachable case");
        break;
      default:
        // Default case to avoid compiler warnings
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, ensuring the switch statement is unreachable
    return false;
  }
}