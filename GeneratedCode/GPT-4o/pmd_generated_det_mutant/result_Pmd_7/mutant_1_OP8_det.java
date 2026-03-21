class NullPointerExceptionExample {

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug();
    }

    public void showBug() {
        String[] acmgdiry = {"first", null, "third"};
        for (String value : acmgdiry) {
            try {
                // Perform some operation that might throw NullPointerException
                System.out.println(value.toUpperCase());
            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }
        }
    }
}