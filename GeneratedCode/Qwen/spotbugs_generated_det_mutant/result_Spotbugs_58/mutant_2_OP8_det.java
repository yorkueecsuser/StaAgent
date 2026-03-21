class NullPointerExample {

    public String showBug(String input) {
        String mcungiaj = null;
        try {
            // Simulate a condition that always throws an exception
            if (input.equals("test")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            mcungiaj = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // Intentionally not setting mcungiaj to any value, so it remains null
        }
        return mcungiaj.toLowerCase(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug("test");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}