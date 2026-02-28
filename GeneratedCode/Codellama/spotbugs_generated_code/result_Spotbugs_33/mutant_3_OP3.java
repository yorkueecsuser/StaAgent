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

    // Mutant 1: Unreachable if statement
    public int showBug1() {
        UninitializedField uf = new UninitializedField(null);
        int hashCode = 0;
        if (false) {
            hashCode = uf.getHashCode();
        }
        return hashCode;
    }

    // Mutant 2: Unreachable if statement with non-final variable
    public int showBug2() {
        UninitializedField uf = new UninitializedField(null);
        boolean shouldGetHashCode = getCondition();
        int hashCode = 0;
        if (shouldGetHashCode) {
            hashCode = uf.getHashCode();
        }
        return hashCode;
    }

    // Mutant 3: Unreachable if statement with method call
    public int showBug3() {
        UninitializedField uf = new UninitializedField(null);
        boolean shouldGetHashCode = getCondition();
        int hashCode = 0;
        if (shouldGetHashCode) {
            hashCode = uf.getHashCode();
        }
        return hashCode;
    }
}