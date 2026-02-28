enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {}
    // Mutant: Duplicate the loop variable initialization
    for (int i = 0; i < e.name().length(); i++) {}
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {}
    // Mutant: Duplicate the loop variable initialization
    for (Object obj : MyEnum.class.getEnumConstants()) {}
  }
}