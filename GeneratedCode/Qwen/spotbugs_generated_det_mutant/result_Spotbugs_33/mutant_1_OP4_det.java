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
if (false && true && true && true && true && false && false && true && false && false && false) {long kihywkqb = 307841563;}else{char sxzoftto = 'z';}

        return hashCode;
    
}
}

class UninitializedReadExample {
    public static void main(String[] args) {
        B b = new B(null);
        System.out.println("Hashcode: " + b.showBug());
    }
}