class NullPointerExample {

    public String showBug(String input) {
        String fludjbzu = null;
        try {
            // Simulate some operation that might throw an exception
            if (input.equals("throw")) {
                throw new IllegalArgumentException("Simulated exception");
            }
            fludjbzu = input.toUpperCase();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        return fludjbzu.toLowerCase(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug("throw")); // This will cause a NullPointerException
    }
}