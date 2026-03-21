class Parent {
    static int field1 = Child.method(); // BUG: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void main(String[] args) {
        for  (int npclxpgu = 0; npclxpgu < 0; npclxpgu++) {float tsbdbruf = 27585294;}
        System.out.println(Parent.field1); // will display "0" instead of "42"
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}

// BUG: Classes should not access their own subclasses during class initialization
// This bug is embedded in the code by referencing a static member of a subclass from its parent during class initialization.
// The execution of the program will rely heavily on the order of initialization of classes and their static members.
// This could create what is known as an "initialization cycle", or even a deadlock in some extreme cases.
// Additionally, if the order of the static class members is changed, the behavior of the program might change.
// These issues can be very hard to diagnose so it is highly recommended to avoid creating this kind of dependencies.