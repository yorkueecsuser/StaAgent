enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    int i = 0;
    do {
      if (i >= e.name().length()) break;
    } while (true);
  }

  void iterate_enum_constants() {
    Object[] enumConstants = MyEnum.class.getEnumConstants();
    int index = 0;
    do {
      if (index >= enumConstants.length) break;
      Object obj = enumConstants[index];
      index++;
    } while (true);
  }
}