class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        String temp = input; // Added duplication of assignment
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}