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
int dirtkmol = 0;switch  (dirtkmol) {case 1:float dmkjsqpq = 78834490;break;default:char iczojcgf = 'g';break;}

        return value;
    
}

    public void showBug() {
        System.out.println(hashCode); 
    }
}