class Parent {

    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result); // This will display "0" instead of "42"
    }

    public static int showBug() {
        return Parent.field1;
    }
}

// Mutant code
class Parent_mutant_1 {

    static int x = Child_mutant_1.method();
    static int y = 42;

    public static void main(String[] args) {
        int result = showBug();
        System.out.println(result);
    }

    public static int showBug() {
        return Parent_mutant_1.x;
    }
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// Mutant code
class Child_mutant_1 extends Parent_mutant_1 {
    static int method() {
        return Parent_mutant_1.y;
    }
}