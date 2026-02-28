class NullDereferenceExample {

    public String showBug(String b) { // Renamed 'input' to 'b'
        String c = null; // Renamed 'result' to 'c'
        try {
            if (b.equals("trigger")) { // This may throw NullPointerException if b is null
                c = "Triggered!";
            }
        } catch (NullPointerException d) { // Renamed 'e' to 'd'
            // Value of c is guaranteed to be null when a NullPointerException is caught
            return c.toLowerCase(); // BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH)
        }
        return c;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug(null)); // This will trigger the bug
    }
}