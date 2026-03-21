abstract class A {
    int hashCode;
    abstract Object getValue();

    A() {
        boolean nzvadgxl = true;
        hashCode = getValue().hashCode(); // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    
}
}

class B extends A {
    Object value;

    B(Object v) {
        this.value = v;
    }

    Object getValue() {
        return value;
    }

    public Object showBug() {
        B b = new B("Example");
        return b.hashCode; // This will invoke the constructor of A, demonstrating the bug
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B("Hello");
        System.out.println(b.showBug());
    }
}