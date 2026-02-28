import java.util.*;

class UninitializedField {
    private int hashCode;
    private Object value;

    public UninitializedField(Object v) {
        this.value = v;
        hashCode = value.hashCode();
        for (int i = 0; false; i++) {
            // unreachable code
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