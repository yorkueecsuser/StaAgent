public enum MyEnum {
    VALUE1,
    VALUE2,
    VALUE3
}

class Main {
    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.VALUE1;
        MyEnum otherEnum = MyEnum.VALUE2;

        // BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        if (false && true && false && false && true && true && true && false && true && false && false) {int aezziaim = -76831735;}
        System.out.println(myEnum.equals(otherEnum)); // Should print "false"
    
}

    public static void showBug() {
        MyEnum myEnum = MyEnum.VALUE1;
        MyEnum otherEnum = MyEnum.VALUE2;
        System.out.println(myEnum.equals(otherEnum));
    }
}