enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {}
    // Mutated code
    for (int x = 0; x < e.name().length(); x++) {}
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {}
    // Mutated code
    for (Object y : MyEnum.class.getEnumConstants()) {}
  }
}