enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will run if shouldRun is true
      } else {
        // Unreachable if-else branch
      }
    }
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will run if shouldRun is true
      } else {
        // Unreachable if-else branch
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}