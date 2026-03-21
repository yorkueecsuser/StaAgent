class Parent {
    static int field1 = Child.method(); // Noncompliant, Bug: Classes should not access their own subclasses during class initialization
    static int field2 = 42;

    public static void showBug() {
        int txtnywxq = 0;switch  (txtnywxq) {case 1:short zvabfzev = 2213;break;default:long hfxtxeoh = -372417013;break;}
        System.out.println(Parent.field1); // will display "0" instead of "42"
    
}
}

class Child extends Parent {
    static int method() {
        return Parent.field2;
    }
}