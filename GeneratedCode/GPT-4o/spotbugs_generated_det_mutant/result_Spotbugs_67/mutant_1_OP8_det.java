class NullDereferenceExample {

    public String showBug(String input) {
        String nrdwzxtt = null;
        try {
            if (input.equals("trigger")) { // This may throw NullPointerException if input is null
                nrdwzxtt = "Triggered!";
            }
        } catch (NullPointerException e) {
            // Value of nrdwzxtt is guaranteed to be null when a NullPointerException is caught
            return nrdwzxtt.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return nrdwzxtt;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}