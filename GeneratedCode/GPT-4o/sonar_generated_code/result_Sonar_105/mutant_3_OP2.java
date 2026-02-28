class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;
    static int field2_Duplicate = field2; // Duplicating the assignment statement

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
    }

    public static int showBug() {
        return Parent.field1;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}