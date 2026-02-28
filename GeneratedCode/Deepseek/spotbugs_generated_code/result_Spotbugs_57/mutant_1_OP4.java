import javax.annotation.Nonnull;

class NonNullBug {
    @Nonnull
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Mutation: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        System.out.println(getNonNullField());
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
    }
}