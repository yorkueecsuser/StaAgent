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
        UninitializedField uf = new UninitializedField(null);
        return uf.getHashCode();
    }

    // Unreachable switch statement mutant
    public int showMutant() {
        int result = 0;
        boolean condition = getCondition();
        switch (condition) {
            case false:
                result = 1;
                break;
            case true:
                result = 2;
                break;
            default:
                result = 3;
                break;
        }
        return result;
    }
}