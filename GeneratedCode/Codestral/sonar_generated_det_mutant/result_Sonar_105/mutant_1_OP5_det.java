class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        int rqvholfu = 0;switch  (rqvholfu) {case 1:int rryzmluk = 188125090;break;default:byte hcbcpuki = 12;break;}
        System.out.println(Parent.field1); // will display "0" instead of "42"
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}