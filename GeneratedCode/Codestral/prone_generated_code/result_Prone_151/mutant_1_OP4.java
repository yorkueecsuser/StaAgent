class SelfEqualsBug {

    private String value;

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // BUG: SelfEquals, always true for self-comparison
            return true;
        }

        // Added unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable, hence it contains a statement that will never be executed
            System.out.println("This line is unreachable");
        } else {
            // Continue with the original code
            if (obj == null || getClass()!= obj.getClass()) {
                return false;
            }
            SelfEqualsBug other = (SelfEqualsBug) obj;
            return value!= null? value.equals(other.value) : other.value == null;
        }
    }

    // Method to return a false condition at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }
}