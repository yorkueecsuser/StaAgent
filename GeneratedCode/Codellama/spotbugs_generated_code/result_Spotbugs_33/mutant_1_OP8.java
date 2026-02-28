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
}

// Renaming user-defined variables declared in a program
// In this case, we rename the 'hashCode' field to 'hc'
class UninitializedField {
    private int hc; // Renamed 'hashCode' field to 'hc'
    private Object value;

    public UninitializedField(Object v) {
        this.value = v;
        hc = value.hashCode(); // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    }

    public int getHashCode() {
        return hc; // Renamed 'hashCode' field to 'hc'
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

// Additional code to demonstrate the mutation
class Main {
    public static void main(String[] args) {
        UninitializedField uf = new UninitializedField(null);
        System.out.println(uf.getHashCode());
    }
}