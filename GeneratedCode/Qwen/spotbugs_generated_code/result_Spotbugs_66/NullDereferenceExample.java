class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = null; // This ensures that result is definitely null
        }
        return result.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 

        // Mutated code with renaming
        String a = input;
        if (a == null) {
            String b = null;
            b = a; // Renamed variable'result' to 'b' but not affecting the bug
        }
        return a; // Renamed variable'result' to 'a' but not affecting the bug
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}