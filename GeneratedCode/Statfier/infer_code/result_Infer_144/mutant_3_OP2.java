enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    for (int i = 0; i < e.name().length(); i++) {
      int i_duplicate = i; // Duplicate of loop index i
    }
  }

  void iterate_enum_constants() {
    for (Object obj : MyEnum.class.getEnumConstants()) {
      Object obj_duplicate = obj; // Duplicate of loop variable obj
    }
  }
}