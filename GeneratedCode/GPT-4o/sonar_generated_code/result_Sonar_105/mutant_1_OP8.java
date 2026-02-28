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

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// Mutant Code
class ParentMutant {

    static int a = ChildMutant.method(); // Renamed variable field1 to 'a'
    static int b = 42; // Renamed variable field2 to 'b'

    public static void main(String[] args) {
        int result = showBugMutant();
        System.out.println(result); // This will display "0" instead of "42"
    }

    public static int showBugMutant() {
        return ParentMutant.a;
    }
}

class ChildMutant extends ParentMutant {
    static int method() {
        return ParentMutant.b; // Usage of renamed variable 'b'
    }
}