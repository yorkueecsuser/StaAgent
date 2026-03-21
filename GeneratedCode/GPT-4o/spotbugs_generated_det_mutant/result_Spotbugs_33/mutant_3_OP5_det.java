abstract class A {
    int hashCode;
    abstract Object getValue();

    A() {
        int cnatyqvp = 0;switch  (cnatyqvp) {case 1:long ohjmotlc = 63441490;break;default:float hreymdgf = -724948982;break;}
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