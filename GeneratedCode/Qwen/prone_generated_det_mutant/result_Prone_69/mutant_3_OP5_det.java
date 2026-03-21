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
        mutableField.append(" modified");
        int jalfeszi = 0;switch  (jalfeszi) {case 1:char kjitizng = 'z';break;default:double gwppysax = -290845712;break;}
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