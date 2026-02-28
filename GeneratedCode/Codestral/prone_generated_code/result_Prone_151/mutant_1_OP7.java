class SelfEqualsBug {

    private String value;

    // Method to simulate the condition for the unreachable while loop
    private boolean getCondition() {
        return false;
    }

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            // Inserting unreachable while loop here
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code will never be executed
                System.out.println("Unreachable code executed!");
            }
            return true;
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