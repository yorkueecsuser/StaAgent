class SelfEqualsBug {

    private String value;
    private String newValue; // Mutant: Renamed variable 'value' to 'newValue'

    public SelfEqualsBug(String value) {
        this.newValue = value; // Mutant: Updated variable name to 'newValue'
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }
        SelfEqualsBug other = (SelfEqualsBug) obj;
        return newValue!= null? newValue.equals(other.newValue) : other.newValue == null; // Mutant: Updated variable name to 'newValue'
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }
}