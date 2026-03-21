class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        int xwjyhkzn = 0;switch  (xwjyhkzn) {case 1:long orsrtyhq = -82827936;break;default:boolean tndhzqki = false;break;}
        System.out.println(Parent.field1); // will display "0" instead of "42"
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}