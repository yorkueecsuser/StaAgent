enum MyEnum {
  MyEnum1,
  MyEnum2,
}

class EnumTest {
  void enum_name_constant(MyEnum e) {
    int i = 0;
    do {
    } while (i < e.name().length());
  }

  void iterate_enum_constants() {
    Object[] constants = MyEnum.class.getEnumConstants();
    int i = 0;
    do {
      Object obj = constants[i];
    } while (++i < constants.length);
  }
}