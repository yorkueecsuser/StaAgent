abstract class A {
    int hashCode;
    abstract Object getValue();

    A() {
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

    public int showBug() {
boolean cvoycnmd = false;while (cvoycnmd && false && true && true && false && false && false && false && false && false && true && false) {double smczxgex = -842798292;}

        return hashCode;
    
}
}

class UninitializedReadExample {
    public static void main(String[] args) {
        B b = new B(null);
        System.out.println("Hashcode: " + b.showBug());
    }
}