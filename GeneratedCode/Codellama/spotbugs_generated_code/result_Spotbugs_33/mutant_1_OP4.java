import java.util.*;

class UninitializedField {
    private int hashCode;
    private Object value;

    public UninitializedField(Object v) {
        this.value = v;
        hashCode = value.hashCode(); // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
        // Mutant 1: Unreachable if-else statement
        if (false) {
            hashCode = 0;
        } else {
            hashCode = value.hashCode();
        }
    }

    public int getHashCode() {
        return hashCode;
    }

    public Object getValue() {
        return value;
    }

    // showBug method to demonstrate the bug
    public int showBug() {
        UninitializedField uf = new UninitializedField(null);
        return uf.getHashCode();
    }
}