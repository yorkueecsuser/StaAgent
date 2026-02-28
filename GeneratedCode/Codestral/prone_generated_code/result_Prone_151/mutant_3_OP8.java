class SelfEqualsBug {

    private String v; // Mutation: Renamed 'value' to 'v'

    public SelfEqualsBug(String value) {
        this.v = value; // Updated to reflect the renamed variable
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
        return v!= null? v.equals(other.v) : other.v == null; // Updated to reflect the renamed variable
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }
}