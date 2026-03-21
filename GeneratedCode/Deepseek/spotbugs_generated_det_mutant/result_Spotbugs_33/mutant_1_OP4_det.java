class Main {
    public static void main(String[] args) {
        new B(new Object()).showBug();
    }
}

abstract class A {
    int hashCode;
    abstract Object getValue();

    A() {
        hashCode = getValue().hashCode(); //BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    }
}

class B extends A {
    Object value;

    B(Object v) {
        this.value = v;
    }

    Object getValue() {
if (true && false && true && false && true && false && false && false && true && false && false) {boolean aaltvrbp = false;}else{short noexcfjj = -1620;}

        return value;
    
}

    public void showBug() {
        System.out.println(hashCode); 
    }
}