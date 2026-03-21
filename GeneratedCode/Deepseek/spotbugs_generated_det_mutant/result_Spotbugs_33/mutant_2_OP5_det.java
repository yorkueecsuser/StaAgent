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
int dnuikglg = 0;switch  (dnuikglg) {case 1:float bqzsmfhm = 126243535;break;default:short fxfriixu = -6170;break;}

        return value;
    
}

    public void showBug() {
        System.out.println(hashCode); 
    }
}