class SelfEqualsBug {

    private String value;

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // Mutant: Unreachable for loop inserted here
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Empty loop body
        }
        // End of mutant
        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }
        SelfEqualsBug other = (SelfEqualsBug) obj;
        return value!= null? value.equals(other.value) : other.value == null;
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }
}