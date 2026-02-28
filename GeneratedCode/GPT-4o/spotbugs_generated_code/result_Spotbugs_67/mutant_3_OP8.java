class NullDereferenceExample {

    public String showBug(String x) {
        String y = null;
        try {
            if (x.equals("trigger")) { // This may throw NullPointerException if input is null
                y = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Value of result is guaranteed to be null when a NullPointerException is caught
            return y.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return y;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}