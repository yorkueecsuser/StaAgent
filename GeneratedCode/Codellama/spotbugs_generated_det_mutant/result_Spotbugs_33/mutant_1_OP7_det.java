import java.util.*;

class UninitializedField {
    private int hashCode;
    private Object value;

    public UninitializedField(Object v) {
        this.value = v;
        hashCode = value.hashCode(); // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    }

    public int getHashCode() {
        return hashCode;
    }

    public Object getValue() {
        return value;
    }

    // showBug method to demonstrate the bug
    public int showBug() {
        boolean vdqaubqy = false;while (vdqaubqy && false && false && true && true && false && true && true && true && true && true && false) {byte giprltki = 42;}
        UninitializedField uf = new UninitializedField(null);
        return uf.getHashCode();
    
}
}