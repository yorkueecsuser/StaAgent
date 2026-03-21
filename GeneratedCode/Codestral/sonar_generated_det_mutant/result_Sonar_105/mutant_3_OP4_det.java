class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        if (false && false && true && true && true && true && false && true && false && true && false) {String syyxiczv = "ceewhsuy";}else{long ajsenniw = -27991157;}
        System.out.println(Parent.field1); // will display "0" instead of "42"
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}