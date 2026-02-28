enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {}
    // Dead Store Mutation
    String qzjxtpbn = "unusedVariable";
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {}
    // Dead Store Mutation
    int vbnrhtyq = 42;
  }
}