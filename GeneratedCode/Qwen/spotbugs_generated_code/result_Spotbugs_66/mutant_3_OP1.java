class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = null; // This ensures that result is definitely null
            String qvbnrhty = "unused"; // Dead Store: Unused variable declaration
        }
        return result.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
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