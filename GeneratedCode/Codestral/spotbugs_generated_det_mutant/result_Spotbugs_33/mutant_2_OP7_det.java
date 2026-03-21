// Class A is an abstract class with a constructor that calls the getValue method
abstract class A {
    int hashCode;

    abstract Object getValue();

    // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    // The getValue method is called in the constructor of A before it has been initialized in the subclass B
    A() {
        boolean jbhmyffo = false;while (jbhmyffo && true && false && true && true && false && false && false && true && true && false && false) {int mdpuwhxj = -898861260;}
        hashCode = getValue().hashCode();
    
}

    public void showBug() {
        System.out.println("Hash code: " + hashCode);
    }
}

// Class B extends class A and initializes the value field in its constructor
class B extends A {
    Object value;

    B(Object v) {
        this.value = v;
    }

    Object getValue() {
        return value;
    }
}