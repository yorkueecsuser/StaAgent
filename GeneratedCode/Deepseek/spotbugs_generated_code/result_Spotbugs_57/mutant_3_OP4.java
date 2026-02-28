import javax.annotation.Nonnull;

class NonNullBug {
    @Nonnull
    private String nonNullField;

    public void setNonNullField(String value) {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        } else {
            this.nonNullField = value;
        }
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        System.out.println(getNonNullField());
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
    }
}