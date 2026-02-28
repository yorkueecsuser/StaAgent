class SelfEqualsBug {

    private String value;

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            // Insert unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    return true;
            }
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }
        SelfEqualsBug other = (SelfEqualsBug) obj;
        return value!= null? value.equals(other.value) : other.value == null;
    }

    private int getUnreachableValue() {
        return 0;
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }
}