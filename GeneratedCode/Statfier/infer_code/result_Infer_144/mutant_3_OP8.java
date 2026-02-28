enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {}
    // Mutated code
    for (int a = 0; a < e.name().length(); a++) {}
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {}
    // Mutated code
    for (Object b : MyEnum.class.getEnumConstants()) {}
  }
}