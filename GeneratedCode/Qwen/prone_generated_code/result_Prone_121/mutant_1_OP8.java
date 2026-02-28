class NullArgumentExample {

    public String showBug(String input) {
        // This method will throw a NullPointerException if null is passed as input
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }

        // Mutated code with renaming
        String a = "test";
        System.out.println(example.showBug(a)); // Using renamed variable 'a'
    }
}