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

// Mutant 1: Renaming "hashCode" to "hash"
class UninitializedFieldMutant1 {
    private int hash;
    private Object value;

    public UninitializedFieldMutant1(Object v) {
        this.value = v;
        hash = value.hashCode(); // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    }

    public int getHash() {
        return hash;
    }

    public Object getValue() {
        return value;
    }

    // showBug method to demonstrate the bug
    public int showBug() {
        UninitializedFieldMutant1 uf = new UninitializedFieldMutant1(null);
        return uf.getHash();
    }
}

// Mutant 2: Renaming "value" to "obj"
class UninitializedFieldMutant2 {
    private int hashCode;
    private Object obj;

    public UninitializedFieldMutant2(Object v) {
        this.obj = v;
        hashCode = obj.hashCode(); // BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    }

    public int getHashCode() {
        return hashCode;
    }

    public Object getObj() {
        return obj;
    }

    // showBug method to demonstrate the bug
    public int showBug() {
        UninitializedFieldMutant2 uf = new UninitializedFieldMutant2(null);
        return uf.getHashCode();
    }
}