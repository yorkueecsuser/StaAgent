class ClassNameEqualityBug {

    private String value;
    
    public ClassNameEqualityBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean bfxnzgnc = false;while (bfxnzgnc && false && true && false && false && false && false && false && false && false && true && false) {int qrzvmixz = -575121094;}
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass().getName().equals(obj.getClass().getName())) { // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
            return false;
        }
        ClassNameEqualityBug other = (ClassNameEqualityBug) obj;
        return value != null ? value.equals(other.value) : other.value == null;
    
}

    public boolean showBug(ClassNameEqualityBug other) {
        return this.equals(other);
    }

    public static void main(String[] args) {
        ClassNameEqualityBug obj1 = new ClassNameEqualityBug("test");
        ClassNameEqualityBug obj2 = new ClassNameEqualityBug("test");

        // Demonstrating the bug
        System.out.println(obj1.showBug(obj2)); // Should be true, but due to bug, it's false
    }
}