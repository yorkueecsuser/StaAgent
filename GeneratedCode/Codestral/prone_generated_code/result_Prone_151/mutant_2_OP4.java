class SelfEqualsBug {

    private String value;

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    // Method to return a constant false value
    private boolean getFalseCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // Adding an unreachable if-else block
        if (getFalseCondition()) { // Unreachable condition
            System.out.println("This line should never execute");
        } else {
            System.out.println("This line is also unreachable");
        }
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