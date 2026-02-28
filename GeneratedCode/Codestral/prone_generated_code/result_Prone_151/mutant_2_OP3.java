class SelfEqualsBug {

    private String value;

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    private boolean alwaysFalseCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (alwaysFalseCondition()) { // Unreachable if statement
            throw new RuntimeException("Unreachable code executed!");
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