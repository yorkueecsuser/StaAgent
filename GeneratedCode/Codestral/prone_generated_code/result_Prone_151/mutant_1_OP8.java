class SelfEqualsBug {

    private String value;
    private String r; // Mutant: Renamed the variable 'value' to 'r'

    public SelfEqualsBug(String value) {
        this.r = value; // Mutant: Used the renamed variable 'r' instead of 'value'
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
        return r!= null? r.equals(other.r) : other.r == null; // Mutant: Used the renamed variable 'r' instead of 'value'
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }
}