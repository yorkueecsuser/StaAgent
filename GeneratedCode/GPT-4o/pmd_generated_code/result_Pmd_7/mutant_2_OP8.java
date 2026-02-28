class NullPointerExceptionExample {

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug();
    }

    public void showBug() {
        String[] data = {"first", null, "third"};
        for (String value : data) {
            try {
                // Perform some operation that might throw NullPointerException
                System.out.println(value.toUpperCase());
            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }
        }
    }
}

// Mutant Code - Renaming Mutation Operator
class NullPointerExceptionExampleMutant {

    public static void main(String[] args) {
        NullPointerExceptionExampleMutant example = new NullPointerExceptionExampleMutant();
        example.showBug();
    }

    public void showBug() {
        String[] data = {"first", null, "third"};
        for (String x : data) { // Renamed 'value' to 'x'
            try {
                // Perform some operation that might throw NullPointerException
                System.out.println(x.toUpperCase());
            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }
        }
    }
}