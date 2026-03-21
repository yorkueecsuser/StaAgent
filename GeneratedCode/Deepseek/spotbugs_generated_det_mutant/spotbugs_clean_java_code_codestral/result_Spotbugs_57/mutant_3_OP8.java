import javax.annotation.Nonnull;

class NonNullBug {
    @Nonnull
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        String renamedField = getNonNullField();
        System.out.println(renamedField);
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
    }
}