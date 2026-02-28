import java.util.Random;

class NonNullBug {
    private String nonNullField;

    public void setNonNullField(String value) {
        this.nonNullField = value;
        // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Added Mutant Code (Unreachable switch statement)
        Random rand = new Random();
        int randomValue = rand.nextInt(10);

        boolean isUnreachable = false;
        if (randomValue < 5) {
            isUnreachable = true;
        }

        if (isUnreachable) {
            switch (randomValue) {
                case 6:
                    System.out.println("Unreachable code executed!");
                    break;
                default:
                    break;
            }
        }
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public void showBug() {
        setNonNullField(null);
        System.out.println(getNonNullField());
    }

    public static void main(String[] args) {
        NonNullBug bug = new NonNullBug();
        bug.showBug();
    }
}