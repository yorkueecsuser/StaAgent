class Parent {
    static int field1 = Child.method(); // original assignment
    static int field1_dup = Child.method(); // duplicated assignment
    static int field2 = 42;

    public static void showBug() {
        System.out.println(Parent.field1);
        System.out.println(Parent.field1_dup); // display the value of the duplicated assignment
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}