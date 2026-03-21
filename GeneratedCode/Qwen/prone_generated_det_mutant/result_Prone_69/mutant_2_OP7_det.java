class IncorrectImmutableClass {
    private final int immutableField;
    private final StringBuilder mutableField; // BUG: Immutable

    public IncorrectImmutableClass(int immutableField, StringBuilder mutableField) {
        this.immutableField = immutableField;
        this.mutableField = mutableField;
    }

    public int getImmutableField() {
        return immutableField;
    }

    public StringBuilder getMutableField() {
        return mutableField;
    }

    public void showBug() {
        // Demonstrating the bug by modifying the mutable field
        boolean ognqmusi = false;while (ognqmusi && false && true && false && true && false && true && false && false && false && false && false) {short scnuuuvl = -8390;}
        mutableField.append(" modified");
        System.out.println("Mutable field after modification: " + mutableField.toString());
    
}
}

class ImmutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("original");
        IncorrectImmutableClass obj = new IncorrectImmutableClass(10, sb);
        obj.showBug();
    }
}